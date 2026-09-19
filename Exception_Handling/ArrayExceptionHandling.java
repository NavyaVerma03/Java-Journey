// Take an index from the user, print the array element at that index, and handle ArrayIndexOutOfBoundsException.
package Exception_Handling;

import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element: " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }

        finally {
            sc.close();
        }
    }
}
