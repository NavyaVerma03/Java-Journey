// Create an Employee class using encapsulation with private variables, getter and setter methods, calculate HRA, DA, and Gross Salary, and display the employee details.
package ClassObject.Enccapsulation;
import java.util.Scanner;

class EmployeeData {

    // Private data members
    private int empId;
    private String name;
    private double basicSalary;

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Calculate HRA
    public double calculateHRA() {
        return basicSalary * 0.20;
    }

    // Calculate DA
    public double calculateDA() {
        return basicSalary * 0.10;
    }

    // Calculate Gross Salary
    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeData e = new EmployeeData();

        System.out.print("Enter Employee ID: ");
        e.setEmpId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter Basic Salary: ");
        e.setBasicSalary(sc.nextDouble());

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Basic Salary: " + e.getBasicSalary());
        System.out.println("HRA: " + e.calculateHRA());
        System.out.println("DA: " + e.calculateDA());
        System.out.println("Gross Salary: " + e.calculateGrossSalary());

        sc.close();
    }
}



