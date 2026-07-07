// Ascending Order by Insertion sorting
package Array.DSA.Shorting;

import java.util.Arrays;

public class InsertionAscending {
    public static void main(String[] args) {
        int[] arr = {4,8,6,2,9};
        System.out.println("Array: "+ Arrays.toString(arr));
        for(int i = 1;i<arr.length-1;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Array after ascending order: "+ Arrays.toString(arr));
    }
}
