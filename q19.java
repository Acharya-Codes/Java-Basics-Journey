 class Counter{
    static int count = 3;
    int instanceNumber = 6;
    Counter() {
        count = count + 1;
        instanceNumber = instanceNumber + 1;
    }
    void disp() {
        System.out.println("Count: " + count);
        System.out.println("IN: " + instanceNumber);
    }
}
class q19{
    public static void main(String args[]) {
        Counter c1 = new Counter();
        c1.disp();
        Counter c2 = new Counter();
        c2.disp();
        Counter c3 = new Counter();
        c3.disp();
        
}
}