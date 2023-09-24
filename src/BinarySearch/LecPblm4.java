package BinarySearch;
//Program cant be run bcoz here we have finite array but it is correct
public class LecPblm4 {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int target=7;
        System.out.println("Hello");
        System.out.println(infiniteSearch(arr,target));
    }
    static int infiniteSearch(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=2*(end-start+1)+end;
            start=newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
