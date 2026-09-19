// Create a LinkedList<Integer>, add at first/last, insert and remove by index, remove first/last, use size() and contains().

package Collection_Framework.List;

import java.util.LinkedList;

public class LinkedListIntegerPractice {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.addFirst(5);
        list.addLast(50);
        list.add(2,100);
        list.remove(3);

        list.removeFirst();
        list.removeLast();

        System.out.println("Final List: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("Contains 20: " + list.contains(20));
    }
}
