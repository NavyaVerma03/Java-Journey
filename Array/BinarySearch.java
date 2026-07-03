// Write a Java program to perform Binary Search on a sorted array and print the index of the searched element. If the element is not found, print "Element not found".
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Array = " + Arrays.toString(arr));

        System.out.print("Enter the number to search: ");
        int e = sc.nextInt();

        int start =0;
        int end = arr.length-1;
        int index = -1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==e){
                index = mid;
                break;
            } else if(arr[mid]<e){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        if(index !=-1){
            System.out.println("Element found at index "+index);
        } else{
            System.out.println("Element not found!");
        }

    }
}
