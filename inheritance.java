class Animal{
    void eat(){
        System.out.print("The animal can eat");
    }
}
    class Dog extends Animal{
        void bark(){
            System.out.print("The animal can bark");
        }
    }
    class inheritance{
        public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.eat();
    }
}
    
    