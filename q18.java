class Person {
    public String name = "Acharya";
    protected int age = 17;
    private int socialSecurityNumber = 1234;
    String city = "Cuddalore";
}
class Employee extends Person {
    void show() {
    System.out.print("Name: " + name);
    System.out.print("Age: " + age);
    System.out.print("SSN: " + socialSecurityNumber);
    System.out.print("City: " + city);
    }
    
}
class q18 {
    public static void main(String args[]) {
    Employee e1 = new Employee();
    e1.show();
    }
}
//So we have proved it here that private cannot be accesed outside the class!!