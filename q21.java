abstract  class Vehicle{
     final void startEngine() {
        System.out.println("Engine started");
    }
    static String getVehicleType(){
        return "General Vehicle";
    }
    void drive() {
        System.out.println("The vehicle is being driven");
    }
}
class Car extends Vehicle{
    void drive() {
        System.out.println("The car is being driven");
    }
                    }
        


class Bike extends Vehicle{
    void drive() {
        System.out.println("The bike is being driven");
    }
        }
    

class q21{
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.startEngine();
        c1.drive();
        System.out.println("-----");
        Bike b1 = new Bike();
        b1.startEngine();
        b1.drive();
    }
}