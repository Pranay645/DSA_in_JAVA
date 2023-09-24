package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={6,5};
        doQuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void doQuickSort(int[] arr,int low,int high){
        if(high<=low){
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while (s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        doQuickSort(arr,low,e);
        doQuickSort(arr,s,high);
    }
}
