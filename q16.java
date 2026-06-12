class Vehicle {
    String brand;
    int year;
    void startEngine() {
        System.out.print("Vehicle engine starts");
    }
}
class Car extends Vehicle {
    String fuelType;
    void startEngine() {
        System.out.print("Car engine starts");
    }
    void drive() {
        System.out.print("Car starts driving");
    }
}
class Truck extends Vehicle {
    int loadCapacity;
    void startEngine() {
        System.out.print("Truck engine starts");
    }
    void haul() {
        System.out.print("Truck is hauling");
    }
}
class q16 {
    public static void main(String args[]) {
        
    }
}