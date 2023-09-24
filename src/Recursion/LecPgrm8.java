package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LecPgrm8 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,101,11,3,4,9};
//        System.out.println((findAllIndex(arr,0,11));
//        findAllIndex(arr,0,11);
//        System.out.println(ls.toString());

        ArrayList<Integer> ls=new ArrayList<>();
        ls=findAllIndex3(arr,0,9);
        System.out.println(ls.toString());
    }
    static List<Integer> ls=new ArrayList<>();
    //First Way
    static void findAllIndex(int[] arr,int ind,int target){
        if(ind==arr.length){
            return ;
        }
        if(arr[ind]==target) {
            ls.add(ind);
        }
            findAllIndex(arr,ind+1,target);

    }

    //Second Way
    static ArrayList findAllIndex2(int[] arr,int ind,int target,ArrayList<Integer> ls){
        if(ind==arr.length){
            return  ls;
        }
        if(arr[ind]==target) {
            ls.add(ind);
        }
         return findAllIndex2(arr,ind+1,target,ls);
    }
    static ArrayList findAllIndex3(int[] arr,int ind,int target){
        ArrayList<Integer> list=new ArrayList<>();
        if(ind==arr.length){

            return  list;
        }
        if(arr[ind]==target) {

            list.add(ind);
        }
        ArrayList<Integer> listFromBelowCalls=findAllIndex3(arr,ind+1,target);
        list.addAll(listFromBelowCalls);
        return list;
    }
    static int linearSearch(int[] arr,int ind,int target){
        if(ind==arr.length){
            return -1;
        }
        if(arr[ind]==target){
            return ind;
        }
        else{
            return linearSearch(arr,ind+1,target);
        }
    }
}
