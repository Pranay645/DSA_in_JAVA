package BinarySearch;
//Find Element in Mountain Array
public class LecPblm6 {
    public static void main(String[] args) {
        int arr[]={0,1,3,5,4,2,1,0};
        int target=1;
        int peak=getMountainPeak(arr);
        if(target==arr[peak]) System.out.println("Element At :"+peak);
        else{
            int index1=orderAgnosticBS(arr,target,0,peak-1);
            int index2=orderAgnosticBS(arr,target,peak+1,arr.length-1);
            if(index1!=-1) System.out.println("Element at: "+index1);
            if(index2!=-1) System.out.println("Element At :"+index2);
        }


    }
    static int getMountainPeak(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid = start + (end - start) / 2;
            //Edge Condition
            if (mid == 0) {
                return mid + 1;
            }
            if (mid == arr.length - 1) {
                return mid - 1;
            }
            if (arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else if (arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
    return -1;
    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end){

        boolean isAsc=arr[0]<arr[arr.length-1];
//        boolean isAsc=false;
//        if(arr[0]<arr[arr.length-1]){
//            isAsc=true;
//        }


        while (start <= end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if (arr[mid]<target) {
                    start=mid+1;
                } else if (arr[mid]>target) {//only else can also work
                    end=mid-1;

                }
            }
            else{
                if (arr[mid]<target) {
                    end=mid-1;
                } else if (arr[mid]>target) {
                    start=mid+1;
                }
            }


        }
        return -1;
    }
}
