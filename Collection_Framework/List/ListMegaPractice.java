// ArrayList, LinkedList, Vector, Stack, Iterator aur ListIterator ke maximum concepts ek program me use karo.
package Collection_Framework.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class ListMegaPractice {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        arrayList.add(1, 50);
        arrayList.set(2, 100);
        arrayList.remove(Integer.valueOf(40));

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Contains 100: " + arrayList.contains(100));
        System.out.println("ArrayList Size: " + arrayList.size());


        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.addFirst(5);
        linkedList.addLast(40);
        linkedList.add(2, 100);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("LinkedList: " + linkedList);


        // Vector
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println("Vector: " + vector);
        System.out.println("Vector Size: " + vector.size());
        System.out.println("Vector Capacity: " + vector.capacity());


        // Stack
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();

        System.out.println("Stack Peek: " + stack.peek());
        System.out.println("Search 20: " + stack.search(20));
        System.out.println("Final Stack: " + stack);


        // Iterator
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();

            if (value == 50) {
                iterator.remove();
            }
        }

        System.out.println("After Iterator: " + arrayList);


        // ListIterator
        ListIterator<Integer> listIterator = arrayList.listIterator();

        System.out.println("Forward:");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Backward:");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


        // ListIterator Insert + Replace
        listIterator = arrayList.listIterator();

        listIterator.next();
        listIterator.add(60);

        while (listIterator.hasNext()) {
            int value = listIterator.next();

            if (value == 100) {
                listIterator.set(200);
            }
        }

        System.out.println("Final ArrayList: " + arrayList);
    }
}
