// Q3: Take a person's age as input. If age is less than 18, throw an exception using the throw keyword with the message "Not eligible for voting" and handle it using try-catch.
package Exception_Handling;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new Exception("Not eligible for voting");
            }
            System.out.println("Eligible for voting");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
