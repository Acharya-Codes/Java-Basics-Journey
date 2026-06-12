abstract class Vehicle {
    abstract void speed();
    void brand(){
        System.out.print("XY Brand");
    }
}
class Car extends Vehicle{
    void speed() {
        System.out.print("20km/hr");
    }
}
    
        
    
// All child classes must have parent's abstract elements and abstract elemnts shouldnt have a body