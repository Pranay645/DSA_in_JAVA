package BinarySearch;

import java.util.Arrays;
//Get First and Last Index of a given number repeatd in array
public class LecPblm3 {
    public static void main(String[] args) {
    int arr[]={5,7,7,7,7,8,8,10};
    int target=7;
//        System.out.println(Arrays.toString(getFirstLastIndex(arr,target)));
        System.out.println(Arrays.toString(getFirstLastIndexByKunal(arr,target)));

    }

    static int[] getFirstLastIndex(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int[] index={-1,-1};
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else {//Equal to condition checked
                start=mid+1;
            }

        }
        index[1]=start-1;//End Index is found
        end=arr.length-1;
        start=0;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<=arr[mid]){//Equal to added
                end=mid-1;
            }else {
                start=mid+1;
            }

        }
        index[0]=end+1;//Start Index is found
        return index;

    }
    static int[] getFirstLastIndexByKunal(int[] arr,int target){
        int[] index={-1,-1};
        index[0]=search(arr,target,true);
        if(index[0]!=-1){
            index[1]=search(arr,target,false);

        }

            return index;
    }
    static int search(int[] arr,int target,boolean isStartIndex){
        int start=0;
        int end=arr.length-1;
        int ans=0;
        while (start <= end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                ans=mid;
                if(isStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            } else if (arr[mid]<target) {
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }

        }
        return ans;
    }

}
