package RecursionPractice;

import java.util.Arrays;

public class PP4 {
    public static void main(String[] args) {
        String str="Pranay";
        char[] ch=str.toCharArray();
        ReverseString(ch,0,ch.length-1);
        System.out.println(Arrays.toString(ch));
    }
    static void ReverseString(char[] str,int s,int e){
        if(e<=s){
            return;
        }
        char temp=str[s];
        str[s]=str[e];
        str[e]=temp;
        ReverseString(str,s+1,e-1);
    }
}
