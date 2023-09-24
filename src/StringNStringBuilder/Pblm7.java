package StringNStringBuilder;

public class Pblm7 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
    class Solution {
        public String workingConvertToTitle(int cN) {

            StringBuilder sb = new StringBuilder();

            while (cN > 0) {
                int rem = (cN - 1) % 26;
                sb.append((char) ('A' + rem));
                cN = (cN - 1) / 26;
            }

            sb.reverse();
            return sb.toString();

        }
    }
    static   String convertToTitle(int columnNumber) {

        if(columnNumber<=26){
            char ch=(char)('A'+(columnNumber-1));
            return ch+"";

        }else{
            StringBuffer sb=new StringBuffer();
            while(columnNumber>0){
                int letter=columnNumber%26;
                columnNumber=columnNumber/26;
                char ch='a';
                if(letter==0){
                    ch='Z';
                }
                else{
                     ch=(char) ('A'+(letter-1));

                }
                sb.append(ch);
            }
            sb=sb.reverse();
            return sb.toString();
        }

    }
}
