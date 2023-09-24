package External;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            System.out.println(fout.getChannel());

            System.out.println(fout.getFD());
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}


}
}
