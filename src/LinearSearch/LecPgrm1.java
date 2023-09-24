package LinearSearch;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class LecPgrm1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int index=linearSearch(arr,7);
        System.out.println("Index ="+index);
    }
    @Contract(pure = true)
    static int linearSearch(int @NotNull [] num, int target){
        if(num.length==0){
            return 0;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                return i;
            }
        }
        return -1;
    }
}
