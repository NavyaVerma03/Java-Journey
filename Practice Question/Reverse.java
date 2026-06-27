// Reverse a number
import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = input.nextInt();
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is " + rev);
    }
}