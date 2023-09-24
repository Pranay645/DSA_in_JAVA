package BinarySearch;

public class LecPblm2 {
    public static void main(String[] args) {
        System.out.println("Function Called !");

        char[] arr={'a','c','e','h','k'};
        char ch= nextGreatestLetter(arr,'k');
//        System.out.println(arr[index]);
        System.out.println(ch);
        System.out.println("Function Called !");
    }
    static char nextGreatestLetter(char[] arr, char ch){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int middle=start+(end-start)/2;
            if(ch<arr[middle]){
                end=middle-1;
            } else  {
                start=middle+1;
            }


        }
        return arr[start%arr.length];

    }
}
