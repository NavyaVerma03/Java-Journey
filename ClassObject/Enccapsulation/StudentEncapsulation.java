// Create a Student class with private name and age variables and use getter and setter methods to set and display student details.
package ClassObject.Enccapsulation;

public class StudentEncapsulation {
    public static void main(String[] args) {
        Students s = new Students();

        s.setName("Navya");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }

}

class Students {
    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}