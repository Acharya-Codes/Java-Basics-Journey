class Animal1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Animal2 {
    void sleep() {
        System.out.println("Animal sleeps");
    }
}
class Dog extends Animal1,Animal2 {

}
class multiinherit {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.sound();
        d1.sleep();
    }
}

// THIS CODE ACTUALLY DOESNT WORK AS line 11 IS THE ERROR....DUE TO THE DIAMOND PROBLEM!!!