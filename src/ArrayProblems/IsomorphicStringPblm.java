package ArrayProblems;
import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStringPblm {
    static boolean areIsomorphicByHash(String str1, String str2)
    {
        if(str1.length()!=str2.length()) return false;

        HashMap<Character, Character> charCount
                = new HashMap();
        char c = 'a';
        for (int i = 0; i < str1.length(); i++) {
            if (charCount.containsKey(str1.charAt(i))) {
                c = charCount.get(str1.charAt(i));
                if (c != str2.charAt(i))
                    return false;
            }
            else if (!charCount.containsValue(
                    str2.charAt(i))) {
                charCount.put(str1.charAt(i),
                        str2.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length()) return false;
        Boolean[] bool=new Boolean[str1.length()];
        Arrays.fill(bool,false);
        for(int i=0;i<str1.length();i++){
            if(!bool[i]){
                char a=str1.charAt(i);
                char b=str2.charAt(i);
                for(int j=i;j<str1.length();j++){
                    if(a==str1.charAt(j) && b==str2.charAt(j)){
                        bool[j]=true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areIsomorphic("aab","xxy"));
    }
}
