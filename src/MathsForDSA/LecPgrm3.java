package MathsForDSA;

public class LecPgrm3 {
    public static void main(String[] args) {
        System.out.println(getSquareroot(40,5));
    }
    static double getSquareroot(int n,int p){
        double root=0.0;
        int s=0;
        int e=n;
        while (s<e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }
            else if(m*m<n){
                s=m+1;
                root=m;
            }else{
                e=m-1;
            }
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while (root*root<n){
                root+=incr;
            }
            root-=incr;
            incr=incr/10;
        }
        return root;
    }
}
