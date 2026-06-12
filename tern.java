import java.util.Scanner;
class tern {
    public static void main(String args[]) {
       System.out.print("Is it raining?");
       Scanner a = new Scanner(System.in);
       String R = a.nextLine();

       String result = R.equalsIgnoreCase("yes")?"Take an Umbrella with you":"No need of an umbrella";

       System.out.print(result);
    }
}