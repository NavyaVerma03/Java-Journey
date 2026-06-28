// Greatest of Three Numbers
import java.util.Scanner;
class LargestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no1: ");
        int a = sc.nextInt();
        System.out.print("Enter no2: ");
        int b = sc.nextInt();
        System.out.print("Enter no3: ");
        int c = sc.nextInt();

        int result = greatest(a , b , c);
        System.out.println("The largest number is " + result);


    }

    public static int greatest(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}