import java.util.Scanner;
public class addition {
    void sum(int b,int d) {
        System.out.println("Sum = " + (b+d));
    }

    public static void main(String args[]) {
        System.out.print("Enter the first variable: ");
        Scanner a =new Scanner(System.in);
        int b = a.nextInt();
        System.out.print("Enter the second variable: ");
        
        int d = a.nextInt();

        addition sum1 = new addition();
        sum1.sum(b,d);
    }

}
    

    