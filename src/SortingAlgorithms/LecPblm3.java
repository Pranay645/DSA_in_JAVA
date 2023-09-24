package SortingAlgorithms;

public class LecPblm3 {
    //https://leetcode.com/problems/missing-number/
    class Solution {
        public int missingNumber(int[] nums) {
            int i=0;
            //Sorting By Cyclic Sort
            while( i < nums.length){
                int correct=nums[i];
                if(nums[i]<nums.length && nums[correct]!=nums[i]){
                    //swap
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }
                else{
                    i++;
                }
            }
            for( i=0;i<nums.length;i++){
                if(nums[i]!=i){
                    return i;
                }
            }
            return nums.length;
        }
    }
}
