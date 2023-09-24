package RecursionPractice;

import java.util.Arrays;

public class PP2 {
    public static void main(String[] args) {
        int[] arr={1,-7,2,3,4,5,-5};
        System.out.println(findMin(arr,arr.length));
        System.out.println(Arrays.toString(findMinMax(arr,Integer.MAX_VALUE,Integer.MIN_VALUE,0)));


    }

    static int findMin(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],findMin(arr,n-1));
    }
    static int[] findMinMax(int[] arr,int min,int max,int index){
        if(arr.length==1){
            return new int[]{arr[0],arr[0]};
        }
        if(index==arr.length){
            return new int[] {min,max};
        }
        if(arr[index]>max){
            max=arr[index];
        }
        if(arr[index]<min){
            min=arr[index];
        }
        return findMinMax(arr,min,max,index+1);
    }
}
