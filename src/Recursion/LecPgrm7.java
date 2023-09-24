package Recursion;

public class LecPgrm7 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,101};


        System.out.println(checkIfSorted(arr,0));
    }



    static boolean checkIfSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        // return arr[index] < arr[index+1] && checkIfSorted(arr,index+1)
        if(arr[index]<arr[index+1]){
            return checkIfSorted(arr,index+1);
        }
        else{
            return false;
        }
    }
}
