import java.util.Scanner;
class q4 {
    public static void main(String args[]) {
        System.out.print("Enter the number: ");
        Scanner N = new Scanner(System.in);
        int num = N.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.print("The number is divisible by 15");
        } else if(num % 3 == 0) {
            System.out.print("The number is divisible by 3");
            } else if(num % 5 == 0) {
                System.out.print("The number is divisible by 5");
            } else {
                System.out.print("The number is neither divisible by 3 nor 5");
                    }

    }
}