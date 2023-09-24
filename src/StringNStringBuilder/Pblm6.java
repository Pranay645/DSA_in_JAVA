package StringNStringBuilder;

public class Pblm6 {
    //https://leetcode.com/problems/length-of-last-word/
    class Solution {
        public int lengthOfLastWord(String s) {
            // StringBuffer sb=new StringBuffer(s);
            // sb=sb.reverse();
            // int i=0;
            // for(i=0;i<sb.length();i++){
            //     if(sb.charAt(i)==' '){
            //         break;
            //     }
            // }
            // // s=sb.substring(0,i+1);
            // // sb=new StringBuffer(s);
            // // sb=sb.reverse();
            // // s=sb.toString();
            // return i;
            s=s.trim();
            int i=s.lastIndexOf(' ');
            String str=s.substring(i+1);
            return str.length();
        }
    }
}
