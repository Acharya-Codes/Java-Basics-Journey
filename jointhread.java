class A extends Thread {
    int i = 0;
    public void run() {
        i = 50;
        System.out.print("i has been changed to: " + i);
    }
}
class jointhread {
    public static void main(String args[]) {
        A a1 = new A();
        a1.start();
        try{
            a1.join();
        } catch(Exception e) {
            System.out.print(e);
        }
    }
}