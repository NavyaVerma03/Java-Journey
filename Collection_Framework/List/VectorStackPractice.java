// Vector me elements add karke size() aur capacity() print karo, Stack me elements push/pop/peek karke final Stack print karo.
package Collection_Framework.List;

import java.util.Vector;
import java.util.Stack;

public class VectorStackPractice {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println("Vector: " + vector);
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        stack.pop();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Final Stack: " + stack);
    }
}