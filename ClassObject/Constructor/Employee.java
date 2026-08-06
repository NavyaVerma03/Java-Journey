// Question:
// Create a class Employee with:
// - Employee()
// - Employee(int id)
// - Employee(int id, String name)
//
// Chain all constructors using this().
//
// Expected Output:
// Employee ID: 101
// Employee Name: Rahul
// One Parameter Constructor
// Default Constructor


package ClassObject.Constructor;

public class Employee {
    Employee() {
        this(101);
        System.out.println("Default Constructor");
    }

    Employee(int id) {
        this(id, "Navya Verma");
        System.out.println("One Parameter Constructor");
    }

    Employee(int id, String name) {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
        new Employee();
    }
}


