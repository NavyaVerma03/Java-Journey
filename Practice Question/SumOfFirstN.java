// Sum of First N Natural Numbers
import java.util.Scanner;
class SumOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nth term: ");
        int n = sc.nextInt();

        int result = sumN(n);
        System.out.println("The sum of the first nth term is " + result);

    }

    public static int sumN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}