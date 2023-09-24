package StringNStringBuilder;

public class Pblm3 {
    public static void main(String[] args) {
        String s="([)]";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        String sb="";
        boolean valid=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch =='(' || ch =='{' || ch=='[')    {
                sb=sb+ch;
                valid =false;
            }
            else if( ch==')' && sb.charAt(sb.length()-1)=='('){
                sb=sb.substring(0,sb.length()-1);
                valid =true;


            }
            else if( ch==']' && sb.charAt(sb.length()-1)=='['){
                sb=sb.substring(0,sb.length()-1);
                valid =true;

            }
            else if(ch=='}' && sb.charAt(sb.length()-1)=='{'){
                sb=sb.substring(0,sb.length()-1);
                valid =true;
            }

            else{
                valid =false;;
            }
        }
        return valid;
    }
}
