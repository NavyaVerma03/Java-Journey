// Create an abstract Employee class with private name and salary variables, implement getters/setters and an interface Workable with a work() method in Developer class.
package ClassObject.Interface;

public class EmployeeSystem {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.setName("Navya Verma");
        d.setSal(5000);

        System.out.println("Name: "+ d.getName());
        System.out.println("Salary: "+ d.getSal());
    }
}

abstract class Employee {
    private String name;
    private double sal;

    void setName(String name) {
        this.name = name;
    }

    void setSal(double sal) {
        this.sal = sal;
    }

    String getName(){
        return name;
    }
    double getSal(){
        return sal;
    }

    abstract void work();
}

interface Workable{
    void work();
}

class Developer extends Employee implements Workable{

    public void work(){
        System.out.println("Developer is writing code.");
    }
}

