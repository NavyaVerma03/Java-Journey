package Array.Multi_Dimensional_Array;

public class MatrixMax {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Step 1: Transpose Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        System.out.println("\nAfter Transpose:");
        printMatrix(matrix);

        // Step 2: Reverse Every Row
        for (int i = 0; i < matrix.length; i++) {

            int left = 0;
            int right = matrix.length - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("\n90° Clockwise Rotated Matrix:");
        printMatrix(matrix);
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
