// Check Weather a number is Positive, Negative or Zero
import java.util.Scanner;
class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(n + " is Zero.");
        } else if(n < 0){
            System.out.println(n + " is a Negative Number.");
        } else{
            System.out.println(n + " is a Positive Number.");
        }
    }
}