package BinarySearch;

public class LecPblm7 {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,3,0,1,1};
        int target=0;
        System.out.println(getElementOfRotatedArray(arr,target));
    }
    static int getElementOfRotatedArray(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        //Everry thing same just addition of one sub condition
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
    //If target less than mid check first in sorted  by checking edge array elemnt of lhs
            else if(target<arr[mid]){
                if(arr[start]<=target) end=mid-1;
                else start=mid+1;
            }
    //If target is greater than mid check first in sorted rhs by checking edge array elemnt of rhs
            else if(target>arr[mid]){
                if(arr[end]>=target) start=mid+1;
                else end=mid-1;
            }
        }
        return -1;
    }
}
