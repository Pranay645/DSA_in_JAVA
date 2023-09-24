package BitManipulation;

public class LecPgrm1 {
    public static void main(String[] args) {
        System.out.println(isOdd(24));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
