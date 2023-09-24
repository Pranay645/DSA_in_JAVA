package SortingAlgorithms;

import java.util.Arrays;

public class LecPgrm1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={4,3,2,7,8,2,3,1};
//        doBubbleSort(arr);
//        doBubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));

//        doSelectionSort(arr2);
//            doInsertionSort(arr2);
        doCyclicSort(arr2);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    static void doCyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;//correct position of pointed element
            if(arr[i]!=correct){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
//    Insertion sort is good for partially presorted array
    static  void doInsertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void doSelectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int swap=arr[first];
        arr[first]=arr[second];
        arr[second]=swap;
    }
    static int getMaxIndex(int[] arr,int start,int  last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void doBubbleSort(int[] arr){
        boolean swapped=false;
        //Counter Loop for counting number of passes
        for(int i=0;i<arr.length;i++){
            //For going through array in each pass
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            //To check if any swapping happened during pass and if not it means array was sorted
            if(!swapped){
                break;
            }
        }
    }
}
