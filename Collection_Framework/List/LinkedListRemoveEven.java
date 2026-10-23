// Write a Java program to remove all even numbers from a LinkedList using an Iterator while preserving the order of odd numbers.
package Collection_Framework.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveEven {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);
        System.out.println("Original List: " + list);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println("Remove Even List: " + list);

    }
}
