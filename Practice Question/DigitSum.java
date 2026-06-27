// Create a method SumOfDigits(int n) that returns the sum of all digits.
import java.util.Scanner;
class DigitSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int  result = sumOfDigits(num);
        System.out.println("Sum of Digits is " + result);


    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}