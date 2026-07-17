// Create an Employee class using default and parameterized constructors, overload the bonus() method, and display employee details.
package ClassObject;
class Employee{
    int id;
    String nm;
    double sal;

    // Default Constructor
    Employee(){
        id = 101;
        nm = "Navya Verma";
        sal = 5000000;
    }

    // Parameterized Constructor
    Employee(int id, String nm, double sal){
        this.id = id;
        this.nm = nm;
        this.sal = sal;
    }

    // Display Method
    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + nm);
        System.out.println("Employee Salary: " + sal);
    }

    // Bonus Method (10% Default)
    void bonus(){
        double bonus = sal * 0.10;
        System.out.println("Bonus (10%): " + bonus);
    }

    // Overloaded Bonus Method
    void bonus(double percentage){
        double bonus = sal * percentage / 100;
        System.out.println("Bonus (" + percentage + "%): " + bonus);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("Employee 1");
        e1.display();
        e1.bonus();
        System.out.println();

        Employee e2 = new Employee(102,"Ashish Raj",450000);
        System.out.println("Employee 2");
        e2.display();
        e2.bonus();


    }
}
