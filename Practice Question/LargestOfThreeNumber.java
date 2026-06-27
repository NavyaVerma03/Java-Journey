// Find the Largest of three numbers.
import java.util.Scanner;
class LargestOfThreeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter no2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter no3: ");
        int n3 = sc.nextInt();
        if((n1 > n2) && (n1 > n3 )){
            System.out.println(n1 + " is Largest");
        } else if (n2>n3) {
            System.out.println(n2 + " is Largest");
        }
        else {
            System.out.println(n3 + " is Largest");
        }
    }
}