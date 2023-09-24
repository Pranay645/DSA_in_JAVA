package ArrayProblems;

import java.util.LinkedList;
import java.util.List;

public class AddNumberToArray {
    class Solution {
        public List<Integer> addToArrayForm(int[] num, int K) {
            List<Integer> ls=new LinkedList<>();
            for(int i=num.length-1;i>=0;i--){
                ls.add(0,(num[i]+K)%10);
                K=(num[i]+K)/10;
            }
            while(K>0){
                ls.add(0,K%10);
                K=K/10;

            }
            return ls;
        }
    }
}
