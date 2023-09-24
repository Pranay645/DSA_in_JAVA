package BinarySearch;
//Find the smallest number larger than given number
public class LecPblm1 {
    public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12,14,16,18,20};
//        System.out.println(getCielingNumber(arr,5));
        System.out.println(getCielingNumberByKunal(arr,13));
    }
    static int getCielingNumber(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return Integer.MIN_VALUE;
        }
        int start=0;
        int end=arr.length-1;
        int ceilingNumber=0;
        while (start<end ){
            int middle=start+(end-start)/2;
            if(target>arr[middle]){
                ceilingNumber=arr[middle+1];//Last thing it will do on reaching the last elemnt through loop
                start=middle+1;
            } else if (target<arr[middle]) {
//                ceilingNumber=arr[middle-1];
                ceilingNumber=arr[middle];//Last thing it will do on reaching the last elemnt through loop
                end=middle-1;
            }else{
                ceilingNumber=arr[middle];
                return ceilingNumber;
            }
//            ceilingNumber=arr[middle];
       }
        return ceilingNumber;
    }
//Bcoz when while loop breaks start exceeds MID and END by 1 index
    static int getCielingNumberByKunal(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
//        int ceilingNumber=0;
        while (start<end ){
            int middle=start+(end-start)/2;
            if(target>arr[middle]){
//                ceilingNumber=arr[middle+1];//Last thing it will do on reaching the last elemnt through loop
                start=middle+1;
            } else if (target<arr[middle]) {
//                ceilingNumber=arr[middle-1];
//                ceilingNumber=arr[middle];//Last thing it will do on reaching the last elemnt through loop
                end=middle-1;
            }else{
                return arr[middle];
            }
//            ceilingNumber=arr[middle];
        }
        return arr[start];
    }

}
//Floor =greatest number less than equal to target
//If asked for floor number return the end index ==> Above explanation prevails

