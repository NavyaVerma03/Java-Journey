// Print the array after every pass of bubble sort;

package Array.DSA.Shorting;

import java.util.Arrays;

public class PrintArrayEveryPass {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println();
        array(arr);
    }

    public static void array(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Pass " + (i+1) + ": " + Arrays.toString(arr));
            System.out.println();

        }

        System.out.println("Array after sorted: " + Arrays.toString(arr));
    }
}
