import java.util.Scanner;
class finallyy {
    public static void main(String args[]) {
    System.out.print("Enter a number: ");
    Scanner A = new Scanner(System.in);
    int a = A.nextInt();

    try{
        System.out.println("The number you entered is: " + a);
    }
     catch(Exception e) {
        System.out.println("Please enter an integer value!");
    } finally {
        System.out.print("Hi, I am new to java!");
    }
}
}