package RecursionPractice;

public class PP3 {
    public static void main(String[] args) {
        String str="aPnay";
        System.out.println(findUpperCase(str,str.length()));
    }
    static char findUpperCase(String str,int n){
        if(n==0){
            return ' ';
        }
        if(str.charAt(n-1)>'A' && str.charAt(n-1)<'Z' ){
            return str.charAt(n-1);
        }else{
            return findUpperCase(str,n-1);
        }
    }
}
