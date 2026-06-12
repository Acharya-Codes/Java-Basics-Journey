import java.util.Scanner;
class q1 {
    public static void main(String args[]) {

System.out.print("Enter your name: ");
    Scanner name = new Scanner(System.in);
    String N = name.nextLine();
    System.out.println("Your name is: " + N);

    System.out.print("Enter your marks: ");
    Scanner marks = new Scanner(System.in);
    float M = marks.nextFloat();
    System.out.println("Yoour marks is: " + M/10);

    System.out.print("Enter your department: ");
    Scanner dept = new Scanner(System.in);
    String D = dept.nextLine();
    System.out.print("Your department is: " + D);
}
    }
    