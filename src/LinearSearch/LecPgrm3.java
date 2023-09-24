package LinearSearch;

public class LecPgrm3 {
    public static void main(String[] args) {

    }
    static boolean linearSearch(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
