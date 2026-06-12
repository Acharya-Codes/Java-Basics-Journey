import java.util.Scanner;
class nestedfor {
    public static void main(String args[]) {
        System.out.print("How many stars do u need ?: ");
        Scanner S = new Scanner(System.in);
        int s = S.nextInt();

        System.out.print("How many rows of stars do u need ?: ");
        int r = S.nextInt();

        for(int i = 1; i<=r;i++) {
            for(int j = 1; j<=s;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}