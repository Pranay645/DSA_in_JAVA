package Recursion;

import java.util.Arrays;

public class LecPgrm11 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        doSelectionSort(arr,0,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void  doSelectionSort(int[] arr,int i,int j,int maxIndex){
        if(i== arr.length)return;
        if(j< arr.length-i){
            if(arr[j]>arr[maxIndex]){

                maxIndex=j;
            }
            doSelectionSort(arr,i,j+1,maxIndex);
        }else{
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
            doSelectionSort(arr,i+1,0,0);
        }
    }
    //Here r is passed as arr.length
    static void doSelectionKunalMethod(int[] arr,int r,int c,int maxIndex){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[maxIndex]){
                doSelectionKunalMethod(arr,r,c+1,c);
            }else{
                doSelectionKunalMethod(arr,r,c+1,maxIndex);
            }
        }else{
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[r-1];
            arr[r-1]=temp;
            doSelectionKunalMethod(arr,r-1,0,0);
        }
    }
}
