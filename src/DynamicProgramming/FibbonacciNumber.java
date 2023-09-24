package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FibbonacciNumber {
    public static int getFibonacci(int n, int[] arr){
        if(n<=1){
            return n;
        }
        if(arr[n]!=-1) return arr[n];
        return arr[n]=getFibonacci(n-1,arr) + getFibonacci(n-2,arr);
    }
    public static void main(String[] args) {


        int[] arr=new int[8];
        Arrays.fill(arr,-1);
        System.out.println(getFibonacci(7,arr));
    }
}
