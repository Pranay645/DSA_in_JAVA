package LinearSearch;

public class LecPgrm2 {
    public static void main(String[] args) {
    String name="Pranay";
        System.out.println(linearSearch(name,'p'));
    }
    static boolean linearSearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return  true;
            }
        }
        return false;
    }
    static boolean linearSearch2(String str,char target){
        if(str.length()==0){
            return false;
        }
       for(char ch:str.toCharArray()){
           if(ch==target){
               return true;
           }
       }
        return false;
    }
}
