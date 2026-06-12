import java.util.Scanner;
class throww{
    public static void main(String args[]) {
        System.out.print("Enter your age: ");
        Scanner A = new Scanner(System.in);
        try{
            int age = A.nextInt();
            if(age<1) {
            throw new ArithmeticException("Age cannot be less than one");
        } else {
            System.out.print("Your age is: " + age);
        }
        } catch(Exception e) {
            System.out.print(e);
        }
    }
}