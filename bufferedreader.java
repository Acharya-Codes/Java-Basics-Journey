import java.io.FileReader;
import java.io.BufferedReader;
class fileread{
     public static void main(String args[]) {
        try {
            FileReader f1 =  new FileReader("output3.txt");
            BufferedReader b1 = new BufferedReader(f1);
            int c = b1.read();
            while( c != -1) {
                System.out.print((char) c);
                 c = b1.read();
            }
        } catch(Exception e) {
            System.out.print("Something went wrong");
        }
     }
}