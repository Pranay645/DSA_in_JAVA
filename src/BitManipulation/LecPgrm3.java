package BitManipulation;

public class LecPgrm3 {
    public static void main(String[] args) {
        System.out.println(getMagicNumber(3));
        System.out.println(Integer.toBinaryString(4));
    }
    static int getMagicNumber(int n){
        int base=5,ans=0;
        while (n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
}
