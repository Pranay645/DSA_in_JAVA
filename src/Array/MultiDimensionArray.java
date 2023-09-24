package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][];//int[row][column] where rows are mandatory
        int[][] arr2d=new int[3][3];
        Scanner sc=new Scanner(System.in);
        arr= new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int row=0;row<arr2d.length;row++){
            for(int col=0;col<arr2d[row].length;col++){
                arr2d[row][col]=sc.nextInt();
            }
        }
        for(int row=0;row<arr2d.length;row++){
            for(int col=0;col<arr2d[row].length;col++){
                System.out.printf(arr[row][col]+" ");
            }
            System.out.println();
        }
        for(int[] a: arr2d){
            System.out.printf(Arrays.toString(a));
        }
//        System.out.println(arr2d[2][3]);
    }
}
