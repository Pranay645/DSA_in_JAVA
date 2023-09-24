package Recursion;

public class LecPgrm2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,66,77,88};
        System.out.println(binarySearch(arr,77,0,arr.length-1));
    }
    static int binarySearch(int[] arr,int target,int s,int e){
        if(e<s){
            return -1;
        }
        int m=s+(e-s)/2;

        if(arr[m]==target){
            return m;
        } else if (target <arr[m]) {
            return binarySearch(arr,target,s,m-1);
        }
        else{
           return binarySearch(arr,target,m+1,e);
        }
    }
}
