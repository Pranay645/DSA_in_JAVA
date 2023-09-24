package Recursion;

import java.util.Arrays;

public class LecPgrm10 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        doBubbleSort(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void doBubbleSort(int[] arr,int i,int j){
        if(i==arr.length) return;
        if(j<arr.length-i){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            doBubbleSort(arr,i,j+1);
        }else{
            doBubbleSort(arr,i+1,1);
        }

    }
}
