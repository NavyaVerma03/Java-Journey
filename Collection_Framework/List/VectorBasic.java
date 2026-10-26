// Create a Vector of integers, add five numbers, and display the Vector, its size, and its capacity.

package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorBasic {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println("Vector: " + v);
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
    }
}
