package StringNStringBuilder;

import java.util.HashMap;
import java.util.Map;

public class Pblm1 {
    //https://leetcode.com/problems/roman-to-integer/
    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                switch (s.charAt(i)) {
                    case 'I' -> {
                        if (result >= 5)result-= 1;
                        else result += 1;
                    }case 'V' -> {
                        if (result >= 10)result-= 5;
                        else result += 5;
                    }case 'X' -> {
                        if (result >= 50)result-= 10;
                        else result += 10;
                    }case 'L' -> {
                        if (result > 100)result-= 50;
                        else result += 50;
                    }case 'C' -> {
                        if (result >= 500)result-= 100;
                        else result += 100;
                    }case 'D' -> {
                        if (result >= 1000)result-= 500;
                        else result += 500;
                    }case 'M' -> {
                        result += 1000;
                    }
                }
            }
            return result;
        }

//By Hash

        public int romanToIntByHash(String s) {
            Map<Character,Integer> map=new HashMap<>(){{
                put('I',1);
                put('V',5);
                put('X',10);
                put('L',50);
                put('C',100);
                put('D',500);
                put('M',1000);

            }};
            int result =0,n=s.length();
            for(int i=0;i<n;i++){
                if(i<n-1 && (map.get(s.charAt(i))< map.get(s.charAt(i+1)))){
                    result-=map.get(s.charAt(i));
                }
                else{
                    result+=map.get(s.charAt(i));
                }
            }
            return result;
        }
    }
}
