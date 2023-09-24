package RecursionPractice;

import java.util.Arrays;

public class PP1 {
    public static void main(String[] args)
    {
        //input Array
        int[] x = { 1, 2, 3, 4, 5 };
        //Recursive function that will print answer
        printTriangle(x);
        System.out.println(Arrays.toString(x));
    }
    static void printTriangle(int[] x)
    {
        if(x.length==1){
            return;
        }
        int[] temp=new int[x.length-1];
        temp=helper(temp,x,0);
        System.out.println(Arrays.toString(temp));

    }
    //Recursive function to fill elements in temp Array//
    static int[] helper(int[] temp, int[] x, int index)
    {
    return null;
    }
}
