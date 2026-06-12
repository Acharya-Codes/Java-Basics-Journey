interface Animal1{
    void makeSound();
    }
interface Animal2 {
    void eat();
}
class Dog implements Animal1,Animal2 {
    public void makeSound() {
        System.out.println("Wooff");
        }
    public void eat() {
        System.out.println("Eating dog food");
    }
}
class interfacee{
    public static void main(String args[]){
     Dog d1 = new Dog();
    d1.makeSound();
    d1.eat();
    }
   }
// Interface is used as a replacement for multi inheritance!!!
// All methods created in interface are abstract methods!!!
// No constructor for interface!!!