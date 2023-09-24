package ArrayProblems;

import java.util.List;

public class CountItems {
    class Solution1 {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int count = 0;
            for(int i=0; i<items.size(); i++) {
                if(ruleKey.equals("type")) {
                    if(ruleValue.equals(items.get(i).get(0))) {
                        count++;
                    }
                }
                else if(ruleKey.equals("color")) {
                    if(ruleValue.equals(items.get(i).get(1))) {
                        count++;
                    }
                }
                else {
                    if(ruleValue.equals(items.get(i).get(2))) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    class MySolution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            String[] arr={"type","color","name"};

            int flag=0;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals(ruleKey)){
                    flag=i;
                }
            }
            for(int i=0;i<items.size();i++){
                if(items.get(i).get(flag).equals(ruleValue)){
                    sum++;
                }
            }
            return sum;
        }
    }
}
