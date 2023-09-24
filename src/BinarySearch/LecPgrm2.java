package BinarySearch;

import java.util.Arrays;

public class LecPgrm2 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,9,10};

        int[] revArr= {10,9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBS(arr,4));
        System.out.println(orderAgnosticBS(revArr,4));

    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
