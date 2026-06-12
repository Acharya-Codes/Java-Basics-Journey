import java.util.Scanner;
class q25{
    public static void main(String args[]) {
        System.out.print("Enter the first number: ");
        System.out.print("Enter the second number: ");
        Scanner A = new Scanner(System.in);
         int a = A.nextInt();
         int b = A.nextInt();
        try {
       
        } catch(Exception e) {
            System.out.print("Please enter an integer value");
        }
        try{
            
        }catch(Exception e) {
            System.out.print("Please enter an integer value");
        }
        try{
            
            System.out.print("The value is : " + (a/b));
        } catch(Exception e) {
            System.out.print("Please enter a non zero second number");
        }

    }
}