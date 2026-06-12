import java.io.FileReader;
class fileread{
     public static void main(String args[]) {
        try {
            FileReader f1 =  new FileReader("output2.txt");
            int c = f1.read();
            while( c != -1) {
                System.out.print((char) c);
                c = f1.read();
            }
        } catch(Exception e) {
            System.out.print("Something went wrong");
        }
     }
}