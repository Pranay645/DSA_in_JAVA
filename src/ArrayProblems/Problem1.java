package ArrayProblems;
//Remove duplicate from sorted array
//Logic : can be understood
public class Problem1 {

        public int removeDuplicates(int[] nums) {
            int index=1;
            if(nums.length==0){
                return 0;
            }
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    nums[index]=nums[i+1];
                    index++;
                }
            }
            return index;

    }
}
