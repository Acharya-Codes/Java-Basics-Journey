interface A{
    void disp();
}
class funcinterface{
    public static void main(String args[]) {
        A a1 = new A() {
            public void disp() {
                System.out.print("This is being displayed");
            }
        };
        a1.disp();
    }
}
// This is functional interface which can be used to call a interface function!!!