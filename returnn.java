import java.util.Scanner;
class returnn {
    int getsoap(int m,int s) {    // void we r writing as int as the datatype of the remainder is int
        int soap = 30;
        int rem = (m-(s*soap));
        return rem;

    }
    public static void main(String args[]) {
        System.out.print("How many soaps u need?: ");
        Scanner S = new Scanner(System.in);
        int s = S.nextInt();
        System.out.print("Enter the amount you are paying: ");
        int m = S.nextInt();

        returnn r1 = new returnn();
        int rem = r1.getsoap(m,s);
        System.out.print("You have bought " + s + " soaps " + " Get the change amount of rs: " + rem);

        
    }
}