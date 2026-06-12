import java.util.Scanner;
class q8 {
    public static void main(String args[]) {
        System.out.print("Enter the first number: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.print("Enter the second number: ");
        Scanner c = new Scanner(System.in);
        int d = c.nextInt();
        int evencount=0;
        for(int i=b; i <= d; i=i+1) {
            if(i%2==0) {
              evencount = evencount+1;
                }
        }
        System.out.println("Even number: "+i);
    }

}