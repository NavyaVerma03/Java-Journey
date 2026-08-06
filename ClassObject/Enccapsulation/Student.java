// Create a Student class using encapsulation with private variables, getter and setter methods, take input from the user, and display the student details.
package ClassObject.Enccapsulation;

import java.util.Scanner;

class StudentFile {
    // Private data members
    private int rollNo;
    private String name;
    private double marks;

    // Setter methods
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create object of StudentFile
        StudentFile s = new StudentFile();

        System.out.print("Enter Roll No: ");
        s.setRollNo(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter Marks: ");
        s.setMarks(sc.nextDouble());

        System.out.println("\nStudent Details");
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());

        sc.close();
    }
}
