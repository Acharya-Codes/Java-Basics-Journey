import java.util.Scanner;
class q6 {
    public static void main(String args[]) {
        System.out.print("Enter your salary: ");
        Scanner s = new Scanner(System.in);
        float S = s.nextFloat();
        System.out.print("Enter your age: ");
        Scanner a = new Scanner(System.in);
        int A = a.nextInt();

        if(S >= 20000 || A >=25) {
            System.out.print("Enter the loan amount: ");
            Scanner l = new Scanner(System.in);
            float L = l.nextFloat();

            if(L <= 50000) {
                System.out.print("You are eligible for loan");
            } else {
                System.out.print("The maximum loan amount is 50,000");
            }

        } else {
            System.out.print("You are not eligible to take loan");
        }
        }
}