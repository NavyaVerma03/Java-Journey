package Array.Multi_Dimensional_Array;

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 2-D Array: ");
        int s = sc.nextInt();

        int[][] a=new int[s][s];
        int[][] b=new int[s][s];
        int[][] sum=new int[s][s];

        System.out.println("Enter first matrix elements: ");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();

            }
        }

        System.out.println("Enter second matrix elements: ");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();

            }
        }

        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println("sum: ");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print(sum[i][j]+" ");

            }
            System.out.println();
        }


    }
}
