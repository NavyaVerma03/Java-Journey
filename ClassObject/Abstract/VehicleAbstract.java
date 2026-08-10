// Create an abstract Vehicle class with a constructor and abstract start() method, then create Car and Bike classes to implement start().
package ClassObject.Abstract;

public class VehicleAbstract {
    public static void main(String[] args) {
        Car c =new Car("Toyota");
        c.start();
        Bike b = new Bike("Honda");
        b.start();
    }
}

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void start() {
        System.out.println(brand + " Car starting");
    }
}

class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }
    void start() {
        System.out.println(brand + " Bike starting");
    }
}
