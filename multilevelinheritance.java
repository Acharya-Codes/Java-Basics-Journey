class A{
    int one = 1;
}
class B extends A{
    int two = 2;
}
class C extends B{
    int three = 3;
}
class multilevelinheritance {
    public static void main(String args[]){
    multilevelinheritance obj1 = new multilevelinheritance();
    System.out.print(obj1.three);
    }
}