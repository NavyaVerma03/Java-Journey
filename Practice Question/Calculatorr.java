class Calculatorr {

    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    double calculate(double a, double b) {
        return a + b;
    }

    double calculate(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculatorr c = new Calculatorr();

        System.out.println("Sum of 2 integers       : " + c.calculate(10, 20));
        System.out.println("Sum of 3 integers       : " + c.calculate(10, 20, 30));
        System.out.println("Sum of 2 doubles        : " + c.calculate(15.5, 16.0));
        System.out.println("Sum of int + double     : " + c.calculate(10, 20.5));
    }
}
