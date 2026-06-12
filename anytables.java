import java.util.Scanner;
class anytables {
    public static void main(String args[]) {
        System.out.print("Enter which mathematical multiplication you want to know: ");
        Scanner M = new Scanner(System.in);
        int m = M.nextInt();

        System.out.print("Enter the number upto which you want: ");
        Scanner L = new Scanner(System.in);
        int l = L.nextInt();

        for(int i = 1; i <= l; i=i+1) {
            System.out.println(m "+" i + "=" + (i*m));
            
        }
    }
}