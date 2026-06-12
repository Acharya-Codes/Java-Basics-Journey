class Animal {
    int age = 12;
    Animal(String name) {
        System.out.print(name);
    }
    void sound() {
        System.out.print("Animal makes sound");
    }
}
class Dog extends Animal{
    Dog() {
        super("Monkey");
        super.sound();
        super.age;
    }
}
class super {
    public static void main(String args[]) {

    }
}