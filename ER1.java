import java.util.Scanner;
class ER1 {
    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner A = new Scanner(System.in);
        try{
            int a = A.nextInt();
        } catch(Exception e) {
            System.out.println("Invalid input...Enter a number");
        }
        System.out.print("Programm Ended");
    }
}

//There are many types of error:
// Input mismatch exception
// Arithmetic exception (eg: comes when dividing a number with zero)