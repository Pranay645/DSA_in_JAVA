package Recursion.Subsequence;

public class LetterCombination {
    static String[] map={"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};//No 0,1 Button are there
    public static void doLetterCombination(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=0;i<map[digit].length();i++){
            char ch=map[digit].charAt(i);
            doLetterCombination(p+ch,up.substring(1));
        }
    }

    public static void main(String[] args) {
        doLetterCombination("","23");
    }
}
