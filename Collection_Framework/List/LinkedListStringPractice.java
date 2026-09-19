// Create a LinkedList<String>, add elements, insert elements at the beginning, end and a specific index, remove the first and last elements, then print the final list and its size.

package Collection_Framework.List;

import java.util.LinkedList;

public class LinkedListStringPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("Java");
        list.add("Python");
        list.add("SQL");

        list.addFirst("HTML");
        list.addLast("CSS");

        list.removeFirst();
        list.removeLast();
        list.add(1, "JavaScript");

        System.out.println("Final List: " + list);
    }
}
