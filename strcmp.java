import java.util.Scanner;
class strcmp{
    public static void main(String args[]) {
        System.out.print("Enter the first word: ");
        Scanner f = new Scanner(System.in);
        String a = f.nextLine();

        System.out.print("Enter the second word: ");
        Scanner x = new Scanner(System.in);
        String b = x.nextLine();
        
        if(a.equals(b)) {
            System.out.println("Both the strings are equal");
            } else {
                System.out.println("Both the strings are unequal");
            }
    }
}
   
