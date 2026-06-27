// Check weather a number is divisible by both 5 and 11.
import java.util.Scanner;
class CheckDivisibleBy5and11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no1: ");
        int n = sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("Yes! " + n + " is a divisible by 5 and 11.");
        } else {
            System.out.println("No! " + n + " is not  divisible by 5 and 11.");
        }
    }
}