import java.util.Scanner;
public class garden {
    void total_money(int a, int b) {
        int apple_price = 30;
        int rem = (b-(a*apple_price));
        System.out.print("The total amount is: "+(a*apple_price) + " and your balance is: " + rem);

    }
    public static void main(String args[]) {
        System.out.print("Enter the amount of apples needed: ");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        System.out.print("Enter your money(>=30rs): ");
        int b = A.nextInt();
        
        garden g1 = new garden();
        g1.total_money(a,b);

    }
}