import java.util.Scanner;
class q7 {
    public static void main(String args[]) {
        System.out.print("Enter the first number: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.print("Enter the second number: ");
        Scanner c = new Scanner(System.in);
        int d = c.nextInt();

        for(int i = b; i <= d; i=i+1) {
            System.out.println(i);
        }

         }
}