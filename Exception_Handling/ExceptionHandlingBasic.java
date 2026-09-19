// Take two integers from the user, divide the first by the second, and handle ArithmeticException when the denominator is 0.
package Exception_Handling;

import java.util.Scanner;

public class ExceptionHandlingBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no1: ");
        int no1 = sc.nextInt();
        System.out.print("Enter no2: ");
        int no2 = sc.nextInt();

        try {
            double div = no1 / no2;
            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        finally {
            sc.close();
        }
    }
}
