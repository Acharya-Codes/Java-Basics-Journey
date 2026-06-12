import java.util.Scanner;
class q3{
    public static void main(String args[]) {
        System.out.print("Is lipika alive?");
        Scanner l = new Scanner(System.in);
        String a = l.nextLine();

        if(a.equalsIgnoreCase("Yes")) {
           System.out.print("Acharya weds Lipika");
        } else {
            System.out.print("Acharya is also dead");
        }
            }
}