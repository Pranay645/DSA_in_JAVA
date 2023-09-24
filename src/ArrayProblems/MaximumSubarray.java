package ArrayProblems;

public class MaximumSubarray {
    class BruteSolution {
        public int maxSubArray(int[] nums) {
            int max=Integer.MIN_VALUE,sum=0;
            System.out.println(max);
            System.out.println(3+-4);
            for(int i=0;i<nums.length;i++){
                for(int j=i;j<nums.length;j++){
                    sum=0;
                    for(int k=i;k<j+1;k++){
                        sum=sum+nums[k];
                    }

                    if(max<sum){
                        max=sum;
                    }
                }
            }
            return max;
        }
    }

    class LittleOptimalSolution {
        public int maxSubArray(int[] nums) {
            int max=Integer.MIN_VALUE,sum=0;
            for(int i=0;i<nums.length;i++){
                sum=0;
                for(int j=i;j<nums.length;j++){
                    sum=sum+nums[j];
                    if(sum>max){
                        max=sum;
                    }
                }
            }
            return max;
        }
    }
    class OptimizedSolution {
        //SLiding Window Approach left cursor is fixed and right is moved,and consequntly left cursor is also moved
        public int maxSubArray(int[] nums) {
            int max=Integer.MIN_VALUE,sum=0;
            for(int i=0;i<nums.length;i++){
                if(sum<0){
                    sum=0;
                }
                sum=sum+nums[i];
                if(sum>max){
                    max=sum;
                }
            }
            return max;
        }
    }
}
