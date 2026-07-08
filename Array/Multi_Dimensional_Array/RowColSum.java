// Write a Java program to calculate the sum of each row and each column of a 3 × 3 matrix.
package Array.Multi_Dimensional_Array;

import java.util.Scanner;

public class RowColSum {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);

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

        System.out.println("Row Sum:");

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + " = " + sum);
        }

        System.out.println("Column Sum:");

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " = " + sum);
        }

    }
}
