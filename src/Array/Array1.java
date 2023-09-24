package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        String[] arr=new String[5];
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println(arr[0]);
        for(int i = 0; i<array.length; i++){
            System.out.print("Enter Number :");
            array[i]=sc.nextInt();
        }
        for (int num: array) System.out.println(num);//Here num represent element of Array array
        System.out.println(Arrays.toString(array));
        System.out.println(array);

    }
}
