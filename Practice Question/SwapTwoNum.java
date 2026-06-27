// Swap Two number without using a third variable.
import java.util.Scanner;
class SwapTwoNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter no2: ");
        int n2 = sc.nextInt();
        System.out.println("Before swaping: \n " + "no1: " +n1+"\n no2: "+n2);
        n1 = n1+n2;
        n2 =n1-n2;
        n1= n1-n2;
        System.out.println("After swaping: \n " + "no1: " +n1+"\n no2: "+n2);
    }
}