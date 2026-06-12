import java.util.Scanner;
class q26{
    public static void main(String args[]) {
        System.out.print("Enter the first number: ");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        System.out.print("Enter the second number: ");
        int b = A.nextInt();
        try {
            System.out.print("Your value is: " + (a/b));
        } catch (ArithmeticException e) {
            System.out.print("You cannot divide a number by zero");
        }
    }
}