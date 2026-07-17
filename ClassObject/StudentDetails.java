// Create a class Student with name, rollNo and create a method display() to print student details.
package ClassObject;

 class Student{
     String nm;
     int roll;

     void details(){
         System.out.println("Name: "+nm);
         System.out.println("Roll: "+roll);
     }


}

public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.nm = "Navya Verma";
        s1.roll = 04;
        s1.details();

        Student s2 = new Student();
        s2.nm = "Ashish Raj";
        s2.roll = 49;
        s2.details();

    }
}
