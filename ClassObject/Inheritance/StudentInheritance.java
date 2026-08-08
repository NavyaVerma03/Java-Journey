//  Create a Person class and inherit it into a Student class using Single Inheritance. Use the super keyword to call the parent constructor, take input from the user, and display all details.
package ClassObject.Inheritance;

import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    int roll;
    double marks;
    Student(String name,int age,int roll,double marks){
        super(name,age);
        this.roll=roll;
        this.marks=marks;
    }
    void display(){
        super.display();
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }
}

public class StudentInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age=sc.nextInt();

        System.out.print("Enter Student Roll: ");
        int roll=sc.nextInt();

        System.out.print("Enter Student Marks: ");
        double marks=sc.nextDouble();

        Student s =new Student(name,age,roll,marks);

        System.out.println("\n---------Student Details----------");
        s.display();

        sc.close();
    }
}
