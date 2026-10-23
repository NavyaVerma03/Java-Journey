// Write a Java program to remove duplicate integers from a LinkedList while preserving their insertion order.
package Collection_Framework.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);

        LinkedList<Integer> unique = new LinkedList<>();
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            int num =  itr.next();
            if (!unique.contains(num)){
                unique.add(num);
            }

        }

        System.out.println("Original List: " + list);
        System.out.println("Removing Duplicates: " + unique);

    }
}
