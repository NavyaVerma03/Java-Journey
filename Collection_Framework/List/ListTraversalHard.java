// Write a Java program using an Iterator to remove all even numbers from an ArrayList safely, then print the remaining elements.

package Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTraversalHard {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if(num % 2==0){
               itr.remove();
            }

        }
        System.out.println(list);
    }
}
