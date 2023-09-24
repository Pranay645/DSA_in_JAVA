package ArrayProblems;

import java.util.Arrays;

public class Pangram {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            if(sentence.length()<26){
                return false;
            }
            boolean[] arr=new boolean[26];
            Arrays.fill(arr,false);
            for(int i=0;i<sentence.length();i++){

                int n=sentence.charAt(i)-'a';
                arr[n]=true;
            }
            for(int i=0;i<arr.length;i++){
                if(!arr[i]){
                    return false;
                }
            }
            return true;
        }
    }
    }

