package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//TODO SUBSEQUENCE AND SUBSET OF STRING AND ARRAY /REPEATED ELEMENT IN ARRAY
public class LecPgrm2 {
    public static void doSubsequence(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        doSubsequence(str.substring(1),ans+str.charAt(0));
        doSubsequence(str.substring(1),ans);
    }
    public static ArrayList<String> retSubsequence(String str,String ans){
        if(str.length()==0){
            ArrayList<String> ls=new ArrayList<>();
            ls.add(ans);
            return ls;
        }
        ArrayList<String> left=retSubsequence(str.substring(1),ans+str.charAt(0));
        ArrayList<String> right=retSubsequence(str.substring(1),ans);
        left.addAll(right);
        return left;
    }
    public static ArrayList<String> retSubsequence(String str){
        ArrayList<String> outer =new ArrayList<>();
        outer.add("");
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           int n=outer.size();
           for(int j=0;j<n;j++){
               String sub=outer.get(j);
               String newSub=sub+ch;
               outer.add(newSub);
           }
       }
       return outer;
    }
    public static List<List<Integer>>  subset(int[] arr){
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
       for(int num : arr){
           int n=outer.size();
           for(int i=0;i<n;i++){
               List<Integer> internal=new ArrayList<>(outer.get(i));
               internal.add(num);
               outer.add(internal);
           }
       }
       return outer;
    }

    //For Duplicate Elements
    public static List<List<Integer>>  subsetRepeat(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
           start=0;
           if(i>0 && arr[i]==arr[i-1]){
               start=end+1;
           }
           end=outer.size()-1;
            int n=outer.size();
            for(int j=0;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
//        doSubsequence("abc","");
        System.out.println(retSubsequence("abc",""));

//        List<List<Integer>> ls=subset(new int[]{1,2,3});
//        System.out.println(ls.toString());

        List<List<Integer>> ls=subsetRepeat(new int[]{1,2,2});
        System.out.println(ls.toString());

        System.out.println(retSubsequence("abc"));


    }
}
