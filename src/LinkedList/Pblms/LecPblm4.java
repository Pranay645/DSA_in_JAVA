package LinkedList.Pblms;

public class LecPblm4 {
    class Solution {
        public boolean isHappy(int n) {
            int fast=n;
            int slow=n;
            do{
                slow=getSquare(slow);
                fast=getSquare(getSquare(fast));
            }while(slow!=fast);
            if(slow==1){
                return true;
            }
            return false;
        }
        public int getSquare(int n){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*rem;
                n=n/10;
            }
            return sum;
        }
    }
}
