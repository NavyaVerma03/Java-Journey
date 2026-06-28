// Check Strong Number
import java.util.Scanner;

class StrongNumber {

    public static boolean isStrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isStrong(n)) {
            System.out.println(n + " is a Strong Number");
        } else {
            System.out.println(n + " is not a Strong Number");
        }
    }
}