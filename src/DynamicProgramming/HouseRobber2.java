package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] arr={2,3,2};
        ArrayList<Integer> temp1=new ArrayList<>();
        ArrayList<Integer> temp2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i!=0)  temp1.add(arr[i]);
            if(i!=arr.length-1) temp2.add(i);
        }
        System.out.println(Math.max(maxSubArray(temp2),maxSubArray(temp1)));
    }
    static int maxSubArray(ArrayList<Integer> ls){
        int prev1=ls.get(0);
        int prev2=0;
        for(int i=1;i<ls.size();i++){
            int take=ls.get(i)+prev2;
            int nonTake=0+prev1;
            int curr=Math.max(take,nonTake);
            prev2=prev1;
            prev1=curr;

        }
        return prev1;
    }
}
