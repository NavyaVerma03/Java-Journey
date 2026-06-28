// Create a method isPrime(int n) that return true if the number is prime.
import java.util.Scanner;
class Primecheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        boolean result = isPrime(num);
        System.out.print("Is " + num + " a prime number? \n " + result);

    }

    public  static boolean  isPrime  (int num){

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}