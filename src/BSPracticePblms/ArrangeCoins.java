package BSPracticePblms;

public class ArrangeCoins {
    class EfficientSolution {
        public int arrangeCoins(int n) {
            long start=1,end=n;
            long ans=1;
            while(start<=end){
                long mid=start+(end-start)/2;
                long coinFilled=(mid*(mid+1))/2;
                if(coinFilled<n){
                    start=mid+1;
                    ans=mid;

                }
                else if(coinFilled>n){
                    end=mid-1;
                }
                else{
                    return (int)mid;
                }
            }
            return (int)ans;
        }
    }
    class Solution {
        public int arrangeCoins(int n) {
            int i=1,row=0;
            if(n==0 || n==1){
                return n;
            }
            while(n>=0){
                n=n-i;
                row++;
                i++;
            }
            return row-1;
        }
    }
}
