// Write a Java program to traverse an ArrayList forward and backward using ListIterator.


package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMedium {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> li = list.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
