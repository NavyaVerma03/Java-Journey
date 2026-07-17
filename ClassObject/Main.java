// Create a class Calculator with methods add, subtract, multiply and create an object and call all methods from main().
package ClassObject;

class Calculator{
    void add(float a, float b){
        System.out.println("Addition: " + (a+b));
    }
    void sub(float a, float b){
        System.out.println("Subtraction: " + (a-b));
    }
    void mul(float a, float b){
        System.out.println("Multiplication: " + (a*b));
    }
    void div(float a, float b){
        System.out.println("Division: " + (a/b));
    }


}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5,2);
        c.sub(5,2);
        c.mul(5,2);
        c.div(5,2);


    }
}
