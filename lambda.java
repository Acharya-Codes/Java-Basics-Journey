interface A{
    void disp();
}
class lambda {
    public static void main(String args[]) {
       A a1 = () -> {System.out.println("This is being displayed");};
       a1.disp();
    }
}