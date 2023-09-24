package SortingAlgorithms;

import java.util.*;

public class LecPblm2 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i=0;
            List<Integer> list=new ArrayList<Integer>();
            while(i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    int temp=nums[correct];
                    nums[correct]=nums[i];
                    nums[i]=temp;
                }else{
                    i++;
                }
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=(j+1)){
                    list.add(j+1);
                }
            }
            return list;


        }
    }
}
