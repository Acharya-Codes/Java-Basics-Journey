import java.util.Scanner;
 class ifelse{
   public static void main(String args[]) {
     System.out.println("Is it raining? (Yes/No)");
     Scanner check = new Scanner(System.in);
    String C = check.nextLine();
    if (C.equalsIgnoreCase("yes")){
        System.out.print("Take an umbrella with you");
        } else {
            System.out.print("No need of an umbrella");
        }
   }
 }
    
