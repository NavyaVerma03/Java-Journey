// Create a Printable interface with a print() method and implement it in a Student class to display student details.
package ClassObject.Interface;

public class PrintableInterface {
    public static void main(String[] args) {
        Student s = new Student("Navya Verma",21);
        s.print();
    }
}

interface PrintableInterface1 {
    void print();
}

class Student implements PrintableInterface1 {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
