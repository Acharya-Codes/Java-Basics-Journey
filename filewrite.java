import java.io.FileWriter;
class filewrite{
    public static void main(String args[]) {
       try {
        FileWriter f1 = new FileWriter("output.txt");
        f1.write("Hello brohh");
        f1.close();
        System.out.println("Success");
       } catch(Exception e) {
        System.out.println("Smth went wrong brohh");
       }
}
}