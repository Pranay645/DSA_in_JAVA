package ArrayProblems;

public class IntegerSumUptoZero {
    class Solution {
        public int[] sumZero(int n) {
            int[] arr=new int[n];
            if(n%2==1){
                arr[(int)n/2]=0;
            }

            for(int i=1;i<n/2+1;i++){
                arr[i-1]=i;
                arr[n-i]=-i;
            }
            return arr;
        }
    }
}
