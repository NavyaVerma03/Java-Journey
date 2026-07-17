// Create a class Area and overload the method calculateArea() calculateArea(int side) → Square, calculateArea(int length, int breadth) → Rectangle, calculateArea(double radius) → Circle, Call all overloaded methods.
package ClassObject;
class Area{
    // Area of square
    void calculateArea(int side){
        System.out.println("Area of Square: " + (side*side));
    }

    // Area of Reactangle
    void calculateArea(int l, int b){
        System.out.println("Area of Reactangle: " + (l*b));
    }

    // Area of Circle
    void calculateArea(double r){
        double a = 3.14 * r * r;
        System.out.println("Area of Circle: " + a);
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.calculateArea(3);
        obj.calculateArea(5,7);
        obj.calculateArea(7.0);

    }
}
