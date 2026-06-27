// Find Factorial using Recursion.
import java.util.Scanner;

class FactorialUsingRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);

    }
    public static  int factorial(int n){
        if(n==0|| n==1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}