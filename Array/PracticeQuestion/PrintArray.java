// Write a Java program to print all elements of an array.
package Array.PracticeQuestion;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("Array Elements: [ ");
        for (int i =0; i < arr.length; i++) {
            System.out.print(i);
            if(i !=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

}
