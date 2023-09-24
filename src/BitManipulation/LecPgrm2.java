package BitManipulation;

public class LecPgrm2 {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,1,2,5};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
