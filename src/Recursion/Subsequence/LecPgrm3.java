package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;

//TODO  TOTAL NUMBER OF PERMUTATION OF STRING
public class LecPgrm3 {
    public static void printPermutaion(String p,String up){
        if(up.length()==0){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            printPermutaion(f+ch+s,up.substring(1));
        }
    }
    public static List<String> returnPermutaion(String p,String up){
        if(up.length()==0){
            List<String > ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        char ch=up.charAt(0);
        List<String> per=new ArrayList<>();
        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            List<String> ls=returnPermutaion(f+ch+s,up.substring(1));
            per.addAll(ls);
//            returnPermutaion(f+ch+s,up.substring(1));
        }
        return per;
    }

    public static int countPermutaion(String p,String up){
        if(up.length()==0){
            System.out.print(p+" ");
            return 1;
        }
        char ch=up.charAt(0);
        int per=0;
        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            per=per+countPermutaion(f+ch+s,up.substring(1));
        }
        return per;
    }

    public static void main(String[] args) {
//        printPermutaion("","abc");
//        List<String> ls=returnPermutaion("","abc");
//        System.out.println(ls);

        System.out.println(countPermutaion("","abcd"));
    }
}
