package BinarySearch;

public class LecPblm5 {
    public static void main(String[] args) {
        int arr[]={0,1,5,4,2,1,0};
        System.out.println(arr[getMountainPeak(arr)]);

    }
    //Just find gretar element reside on which side of mid element
    static int getMountainPeak(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            //Edge Condition
            if(mid==0){
                return mid+1;
            }
            if(mid==arr.length-1){
                return mid-1;
            }
            if(arr[mid-1]>arr[mid]){
                end=mid-1;
            }
            else if(arr[mid+1]>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
