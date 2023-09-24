package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
//        arr=doMergeSort(arr);
        doInplaceMergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] doMergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left=doMergeSort(Arrays.copyOfRange(arr,0,mid));//Exclusive Function
        int[] right=doMergeSort(Arrays.copyOfRange(arr,mid,arr.length));

//        return doMerge(left,right);  Works the SAME
        int[] mix=doMerge(left,right);
        return mix;
    }

    private static int[] doMerge(int[] left, int[] right) {
        int[] mix=new int[left.length+ right.length];
        int l=0;
        int r=0;
        int m=0;
        while(l< left.length && r< right.length){
            if(left[l]<right[r]){
                mix[m]=left[l];
                l++;
            }else{
                mix[m]=right[r];
                r++;
            }
            m++;
        }
        while(l<left.length){
            mix[m]=left[l];
            m++;
            l++;
        }
        while(r<right.length){
            mix[m]=right[l];
            m++;
            r++;
        }
        return mix;
    }
    static void doInplaceMergeSort(int[] arr,int s,int e){
        if(s-e==1){
            return;
        }
        int mid=(s+e)/2;
        doInplaceMergeSort(arr,s,mid);
        doInplaceMergeSort(arr,mid,e);
//        doInplaceMerge(arr,s,mid,e)
    }
    static void doInplaceMerge(int[] arr,int s,int m,int e){
        int[] mix=new int[s-e];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
               mix[k]=arr[j];
               j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }
}
