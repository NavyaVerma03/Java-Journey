// Print the multiplication table of a given number.
import  java.util.Scanner;
class  MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}