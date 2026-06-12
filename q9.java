import java.util.Scanner;
class q9{
    public static void main(String args[]) {
        System.out.print("Enter the first value: ");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        System.out.print("Enter the second value: ");
        Scanner c = new Scanner(System.in);
        int d = c.nextInt();

        for(int i = b; i <= d; i=i+1) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}