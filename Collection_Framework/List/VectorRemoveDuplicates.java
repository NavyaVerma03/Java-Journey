// Remove duplicate elements from a Vector while preserving the original insertion order.
package Collection_Framework.List;

import java.util.Vector;

public class VectorRemoveDuplicates {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(10);
        v.add(30);
        v.add(20);
        v.add(40);
        v.add(30);

        System.out.println("Vector: " + v);
        Vector<Integer> unique = new Vector<>();
        for (int num : v) {
            if (!unique.contains(num)) {
                unique.add(num);

            }
        }
        System.out.println("Unique Elements: " + unique);

    }
}
