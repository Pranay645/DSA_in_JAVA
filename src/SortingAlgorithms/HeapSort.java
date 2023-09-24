package SortingAlgorithms;

import java.util.Arrays;

public class HeapSort {
    static void doHeapify(int[] arr,int N,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<N && arr[left]>arr[largest])      largest=left;
        if(right<N && arr[right]>arr[largest])     largest=right;

        if(largest!=i){
            int swap=arr[largest];
            arr[largest]=arr[i];
            arr[i]=swap;

            doHeapify(arr,N,largest);//If let suppose leaf fulfiling heap cond  it goes to root in next iter which in recus will change the root iykyk
        }
    }
    static void doHeapSort(int[] arr,int N){
        for(int i=N-1;i>=0;i--){//Start removig root of heap step by step
            int swap=arr[i];
            arr[i]=arr[0];
            arr[0]=swap;

            doHeapify(arr,i,0);//Here 0 because now it is heap so heapify has to start from root similar to delete in heap concept
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for(int i=(arr.length/2)-1;i>=0;i--){//N/2-1 because from n/2-1 to 0 all are non leaf node in heap
            doHeapify(arr, arr.length, i);
        }
        doHeapSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
