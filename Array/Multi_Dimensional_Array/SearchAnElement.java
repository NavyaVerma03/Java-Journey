package Array.Multi_Dimensional_Array;

public class SearchAnElement {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int search = 5;
        boolean found = false;

        System.out.println("Matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == search) {
                    System.out.println("\nElement Found at (" + i + "," + j + ")");
                    found = true;
                    break;
                }

            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nElement Not Found");
        }
    }
}
