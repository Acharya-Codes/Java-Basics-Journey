class Test{
    public int a = 4;
    private int b = 6;
    protected int c = 9;
    int d = 0;
}
class q17{
    public static void main(String args[]) {
        Test obj = new Test();
        System.out.print("Public: "+obj.a);
        System.out.print("Private: "+obj.b);
        System.out.print("Protected: "+obj.c);
        System.out.print("Normal: "+obj.d);
    }
}
    
// We proved that we cannot acces the private type in different classes!!
