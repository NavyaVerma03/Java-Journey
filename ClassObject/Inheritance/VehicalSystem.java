// Create a Vehicle class, inherit it into Car and Bike (Hierarchical Inheritance), then inherit ElectricCar from Car (Multilevel Inheritance). Use the super keyword, constructors, and display complete details of all vehicles.

package ClassObject.Inheritance;

import java.util.Scanner;

class Vehical {
    String band;
    int year;

    Vehical(String band, int year) {
        this.band = band;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + band);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehical {
    String model;

    Car(String band, int year, String model) {
        super(band, year);
        this.model = model;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}

class ElectricCar extends Car {
    double batterycapacity;

    ElectricCar(String band, int year, String model, double batterycapacity) {
        super(band, year, model);
        this.batterycapacity = batterycapacity;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batterycapacity + " kWh");
    }
}

class Bike extends Vehical {
    int engineCC;

    Bike(String band, int year, int engineCC) {
        super(band, year);
        this.engineCC = engineCC;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Engine CC: " + engineCC + " CC");
    }
}

public class VehicalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("------------- Enter Electric Car Details ----------\n");

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Year: ");
        int caryear = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Battery Capacity: ");
        double batterycapacity = sc.nextDouble();

        sc.nextLine();


        System.out.println("\n----------- Enter Bike Details ----------");

        System.out.print("Enter Brand: ");
        String bikebrand = sc.nextLine();

        System.out.print("Enter Year: ");
        int bikeyear = sc.nextInt();

        System.out.print("Enter Engine CC: ");
        int engineCC = sc.nextInt();


        ElectricCar e = new ElectricCar(brand, caryear, model, batterycapacity);


        Bike b = new Bike(bikebrand, bikeyear, engineCC);


        System.out.println("\n========== Electric Car Details ==========");
        e.display();

        System.out.println("\n========== Bike Details ==========");
        b.display();

        sc.close();
    }
}