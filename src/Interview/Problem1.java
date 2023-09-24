package Interview;

public class Problem1 {
    public static int numberOfPairs(int[] arr,int sum){
        int count=0;
        int len=arr.length;

        for(int i=0;i<len;i++){
            int inSum=0;
            for(int j=i;j<len;j++){
                inSum=inSum+arr[j];
                if(inSum==sum){
                    count++;
                }
                if(inSum>sum){
                    continue;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[]{2,3,1,1,4,6},5));
    }
}
