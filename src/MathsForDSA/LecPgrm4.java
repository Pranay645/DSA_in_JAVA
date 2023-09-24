package MathsForDSA;

public class LecPgrm4 {
    public static void main(String[] args) {
        getFactorsOptimised(36);
    }
    static void getFactorsOptimised(int n){
        for(int i=1;i*i<=n;i++){
            if(n/i==i){
                System.out.println(i);
            }
            else if(n%i==0){
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }
}
