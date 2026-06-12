class Acc1{
    public String bankname = "HDFC";
    private int balance = 10000;
    protected int accnumber = 123456;
    String branchcode = "HDFC001";
}
class print extends Acc1{
    void showDetails() {
    System.out.println("bankname: " + bankname);
    System.out.println("accnumber: " + accnumber);
    System.out.println("branchcode: " + branchcode);
    }
   }
class bankacc {
    public static void main(String args[]) {
        Acc1 a = new Acc1();
        System.out.println("Your bank name is: " + a.bankname);
        System.out.println("Your bank acc number is: " + a.accnumber);
        System.out.println("Your bank branch code is: " + a.branchcode);

    }
}