// Check Weather a year is a Leap Year.
import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int y = sc.nextInt();
        if(y%400==0 || (y%100!=0  && y%4==0 )){
            System.out.println(y + " is a Leap Year.");
        } else {
            System.out.println(y + " is not a Leap Year.");
        }
    }
}