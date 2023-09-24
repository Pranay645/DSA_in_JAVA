package BinarySearch;

public class LecPgrm1 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,4));
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }

        }
        return -1;
    }
}
