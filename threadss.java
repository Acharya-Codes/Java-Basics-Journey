class A extends Thread{
    public void run() {
        for(int i = 0; i<= 10; i++) {
            System.out.println("Hey boii...");
         try {
            Thread.sleep(10);
        } catch(Exception e) {
            System.out.println("Something went wrong boi");
        }
    }
}
}
class B extends Thread{
    public void run() {
        for(int i = 0; i<= 10; i++) {
            System.out.println("Peace...");
         try {
            Thread.sleep(10);
        } catch(Exception e) {
            System.out.println("Something went wrong boi");
        }
    }
}
}
class threadss {
    public static void main(String args[]) {
        A a1 = new A();
        B b1 = new B();

        b1.setPriority(10);
        a1.setPriority(2);

        a1.start();
        b1.start();
    }
}