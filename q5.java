import java.util.Scanner;
class q5 {
    public static void main(String args[]) {

        System.out.print("Enter mark1: ");
        Scanner m = new Scanner(System.in);
        int a = m.nextInt();
        System.out.print("Enter mark2: ");
        Scanner n = new Scanner(System.in);
        int b = n.nextInt();
        System.out.print("Enter mark3: ");
        Scanner o = new Scanner(System.in);
        int c = o.nextInt();
        System.out.print("Enter mark4: ");
        Scanner p = new Scanner(System.in);
        int d = p.nextInt();
        System.out.print("Enter mark5: ");
        Scanner q = new Scanner(System.in);
        int e = q.nextInt();

        float avg = (a+b+c+d+e)/5;
        if(avg>=35) {
            System.out.print("Your are good to go");
        } else {
            System.out.print("You need additional class");
        }
    }
}