// Count Digits
import java.util.Scanner;

class CountDigit {

    public static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = countDigits(n);

        System.out.println("Number of digits = " + result);
    }
}

