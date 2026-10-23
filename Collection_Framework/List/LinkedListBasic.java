// Write a Java program to add elements to a LinkedList, insert elements at the beginning and end, and print the first element, last element, and complete list.
package Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addFirst(5);
        list.addLast(60);
        System.out.println("List: " + list);
        System.out.println("First Element : " + list.getFirst());
        System.out.println("Last Element : " + list.getLast());
    }
}
