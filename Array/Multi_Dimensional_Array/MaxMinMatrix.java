// Write a Java program to find the maximum and minimum element in a 3 × 3 matrix.
package Array.Multi_Dimensional_Array;
import java.util.Scanner;

public class MaxMinMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }



        int max = matrix[0][0];
        int min = matrix[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matrix[i][j] > max)
                    max = matrix[i][j];

                if (matrix[i][j] < min)
                    min = matrix[i][j];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
