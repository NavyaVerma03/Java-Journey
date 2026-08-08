// Create an Employee class and inherit it into a Manager class. Override the display() method, use super.display(), calculate the total salary, and display all details.
package ClassObject.Inheritance;

import java.util.Scanner;

class Employee{
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary){
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void display(){
        System.out.println("Employee ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+basicSalary);
    }
}

class Manager extends Employee{
    double bonus;
    Manager(int empId, String name, double basicSalary, double bonus){
        super(empId, name, basicSalary);
        this.bonus=bonus;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Bonus: "+bonus);

        double totalsalary= basicSalary+bonus;
        System.out.println("Total Salary: "+totalsalary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId=sc.nextInt();

        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        sc.nextLine();
        System.out.print("Enter Salary: ");
        double basicSalary=sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus=sc.nextDouble();

        Manager m=new Manager(empId,name,basicSalary,bonus);

        System.out.println("\n-----------Employee Details-----------");
        m.display();

        sc.close();
    }
}
