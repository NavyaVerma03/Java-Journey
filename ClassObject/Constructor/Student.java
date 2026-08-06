// Question:
// Create a class Student with:
// - Default constructor
// - Parameterized constructor (String name)
//
// The default constructor should call the parameterized constructor using:
// this("Navya Verma");
//
// Expected Output:
// Student Name: Navya Verma
// Default Constructor Called

package ClassObject.Constructor;

public class Student {
    String name;


    Student() {
        this("Navya Verma");
        System.out.println("Default Constructor Called");
    }


    Student(String name) {
        this.name = name;
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}






