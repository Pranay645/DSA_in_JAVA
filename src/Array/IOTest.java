package Array;

import java.io.BufferedInputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) throws IOException {
        int i=0;
        BufferedInputStream obis = new BufferedInputStream(System.in);
        while ( (i = obis.read() ) != -1 ) {
            System.out.println("obis : " + i + " " + (char)i );
            if ((char)i == 'q') break; // ASCII value of q is 113 //
        }
    }
}
