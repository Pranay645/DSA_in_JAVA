package Recursion.Subsequence;

public class LecPgrm1 {
    public static void removeA(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0)=='a'){
            removeA(str.substring(1),ans);
        }
        else{
            removeA(str.substring(1),ans+str.charAt(0));
        }
    }
    public static void removeApple(String str,String ans){
        if(str.length()<5){
            System.out.println(ans+str);
            return;
        }
        if(str.startsWith("apple")){

            removeApple(str.substring(5),ans);
        }
        else{
            removeApple(str.substring(1),ans+str.charAt(0));
        }
    }
    public static String removeA(String str){
        if(str.length()==0) return "";
//        String ans="";
        if(str.charAt(0)=='a'){
            return   removeA(str.substring(1));
        }
        else {
           return str.charAt(0)+ removeA(str.substring(1));
        }

    }
    public static void main(String[] args) {
//        String str="baccad";
//        String ans="";
//        removeA(str,ans);
//        System.out.println(ans);
//        System.out.println(removeA(str));

        String str="an apple in a day";
        String ans="";
        removeApple(str,ans);
        System.out.println("Ans :"+ans);
        System.out.println("Str :"+str);
    }
}
