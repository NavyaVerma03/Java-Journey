// Creator a Simple Calculator using Switch Case.

import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter no2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter Operator(+, -, *, %, /): ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+' -> System.out.println(n1 + n2);
            case '-' -> System.out.println(n1 - n2);
            case '*' -> System.out.println(n1 * n2);
            case '/' -> System.out.println(n1 / n2);
            case '%' -> System.out.println(n1 % n2);
            default -> System.out.println("Invalid Input");

        }
    }
}