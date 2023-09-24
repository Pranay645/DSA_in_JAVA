package LinearSearch;

public class LecPgrm4 {
    public static void main(String[] args) {

    }
    static int findNumbers(int[] nums){
        int numberCount=0;
        for (int i=0;i<nums.length;i++){
            int element=nums[i];
            int count=0;
            while (element>0){
                count++;
                element=element/10;
            }
            if(numberCount%2==0){
                numberCount++;
            }
        }
        return numberCount;
    }
    static int optimizedFindNumbers(int[] nums){
        int count=0;
        for(int n:nums){
            if(even(n)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int count=digits(n);
        if(count%2==0)return true;
        return false;
    }
    static int digits(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            n=n*-1;
        }
        int count=(int)Math.log10(n)+1;
        return count;
    }
}
