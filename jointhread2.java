class A implements Runnable {
    int a = 0;
    public void run() {
        a = 69;
        System.out.print("a has been changed to: " + a);
    }
}
class jointhread2 {
    public static void main(String args[]) {
        A a1 = new A();
        Thread t1 = new Thread(a1);
        t1.start();
    }
}
