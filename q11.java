import java.util.Scanner;
class q11 {
    public static void main(String args[]) {
        System.out.print("Enter the size of array: ");
        Scanner A = new Scanner(System.in);
        int size = A.nextInt();

        int[] array = new int[size];

        for(int i=0;i<size;i=i+1) {
            System.out.print("Enter the value: ");
            array[i] = A.nextInt();
        }
         if(size%2==0) {
            System.out.print("The middle values are: "+ array[(size)/2] + " and " + array[((size)/2)-1]);
         } else {
            System.out.print("The middle value is: "+array[(size)/2]);
         }
    
    }
}