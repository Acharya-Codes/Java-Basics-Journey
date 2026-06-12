import java.util.Scanner;
class q12 {
    void getname(String a) {
        System.out.println("Your name is: "+a);
    }
    void getphone(String b) {
        System.out.println("Your phone number is: "+b);
    }
    public static void main(String args[]) {
        System.out.print("Enter your name: ");
        Scanner A = new Scanner(System.in);
        String a = A.nextLine();
        System.out.print("Enter you phone number: ");
        String b = A.nextLine();
        q12 n1 = new q12();
        q12 p1 = new q12();
        n1.getname(a);
        p1.getphone(b);
    }
}