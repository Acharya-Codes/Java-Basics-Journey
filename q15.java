class Animal {
    String name;
    int age;
    void makesound() {
        System.out.print("This animal makes a sound");
    }
}
class Dog extends Animal{
    String breed;
    void bark() {
        System.out.print("Woof");
        void fetch() {
            System.out.print("Dog is fetching");
        }
    }
}
class Cat extends Animal {
    String colour;
    void makesound() {
        System.out.print("Meoww");
    }
    void climb(){
        System.out.print("Cat is climbing");
    }
}
class q15 {
    public static void main(String args[]) {
        Animal A = new Animal();
    }
}