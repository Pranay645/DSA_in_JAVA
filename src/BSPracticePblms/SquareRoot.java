package BSPracticePblms;

public class SquareRoot {
     static class Solution {
        public int mySqrt(int x) {
            int start=1,end=x,ans=0;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(x/mid==mid) {return mid;}
                else if(x/mid<mid){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                    ans=mid;
                }
            }
            return ans;
        }
    }
}
