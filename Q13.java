import java.util.Scanner;
class Q13 {
    void evenorodd(int b) {
        if(b%2==0) {
            System.out.print("The number is even");
        } else {
            System.out.print("The number is odd");
        }
    }
    public static void main(String args[]) {
        System.out.print("Enter a value: ");
        Scanner A = new Scanner(System.in);
        int b = A.nextInt();
        Q13 q1 = new Q13();
        q1.evenorodd(b);
    }
}