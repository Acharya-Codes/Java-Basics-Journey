import java.util.Scanner;
class NotValidException extends Exception {
       public NotValidException(String s){
       super(s);
       }
}
class throwss{
     public static void main(String args[]) {
        System.out.println("Enter your age: ");
        Scanner A = new Scanner(System.in);
        try{
            int age = A.nextInt();
            if(age >= 18) {
                System.out.println("Welcome!");
            } else {
                throw new NotValidException("Grow up before accessing these kid");
            }
            } catch (Exception e) {
                System.out.println(e);
               }              
          }
        }
     
