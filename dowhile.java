import java.util.Scanner;
class dowhile {
    public static void main(String args[]) {
        System.out.print("Enter a value: ");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        
        do{
            System.out.print("Enter a value > 10 : ");
             a = A.nextInt();
        } while(a<=10);
        System.out.print("Valid input: "+a);
    }
}