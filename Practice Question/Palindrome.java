// Check weather a number is Palindrome.
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;
        while(temp!=0){
            reverse *=temp;
            temp = temp/10;

        }
        if(reverse == temp){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome ");
        }
    }
}