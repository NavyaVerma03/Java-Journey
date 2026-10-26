// Remove all even numbers from a Vector using an Iterator and display the remaining elements.
package Collection_Framework.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorRemoveEven {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(15);
        v.add(20);
        v.add(25);
        v.add(30);
        v.add(35);
        v.add(40);

        System.out.println("Vector: " + v);

        Iterator<Integer> it = v.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
            }
        }

        System.out.println( "Odd Element Vector: " + v);

    }
}
