package StringNStringBuilder;

public class PrettyPrinting {
    public static void main(String[] args) {
        float f=34.8479f;
//        System.out.printf("Formatted number is %.2f",f);
        System.out.printf("Formatted PI : %.3f",Math.PI);
        String s1="Pranay";
        StringBuffer sb=new StringBuffer(s1);
        System.out.println(sb.charAt(sb.length()-1));
        s1=s1.substring(0,s1.length()-1);
        System.out.println(s1);
    }

}
