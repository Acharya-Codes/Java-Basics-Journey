abstract class Animal{
    abstract void makeSound() ;
    }
class Dog extends Animal{
    String name = "Tommy";
    void makeSound() {
        System.out.println("Wooff");
    }
}
class Cat extends Animal{
    String name = "Billy";
    void makeSound() {
        System.out.println("Meoww");
    }
}
class q20 {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}
