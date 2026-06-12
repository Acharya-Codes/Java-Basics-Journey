import java.util.Scanner;
class comp{
    public static void main(String args[]) {
        System.out.print("Enter the first number: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        
        System.out.print("Enter the second number: ");
        Scanner c = new Scanner(System.in);
        int d = c.nextInt();

        if(d>b) {
            System.out.println("Second number is greater than the first");
        } else if(b>d) {
            System.out.println("First number is greater than the second");
        } else {
            System.out.print("Both the numbers are equal");
        }

    }

}