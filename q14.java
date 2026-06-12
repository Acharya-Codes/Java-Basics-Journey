import java.util.Scanner;
class q14 {
    void passorfail(int a) {
        if(a > 35){
            System.out.print("You passed the exam");
        } else if(a == 35){
            System.out.print("You just passed the exam");
        }
            
         else {
            System.out.print("You failed the exam");
        }

    }

    public static void main(String args[]) {
        System.out.print("Enter the total marks: ");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        q14 m = new q14();
        m.passorfail(a);

    }
}