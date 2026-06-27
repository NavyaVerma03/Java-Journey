// Find largest of two variable using ternary (?;) operator.
import java.util.Scanner;
class LargestNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter no2: ");
        int n2 = sc.nextInt();
        int largest = (n1>n2)? n1:n2;
        System.out.println("Largest number is: "+largest);
    }
}