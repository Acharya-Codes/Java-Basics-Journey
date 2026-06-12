import java.io.FileWriter;
import java.io.BufferedWriter;
class bufferedwriter{
    public static void main(String args[]) {
       try {
        FileWriter f1 = new FileWriter("output2.txt");
        BufferedWriter b1 = new BufferedWriter(f1);
        b1.write("Hello brohh");
        b1.close();
        System.out.println("Success");
       } catch(Exception e) {
        System.out.println("Smth went wrong brohh");
       }
}
}
// Buffered writer is same as File writer but with much faster speed