// ArrayList: add, insert, replace, remove, print final list and size
package Collection_Framework.List;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2,100);

        list.set(1,200);

        list.remove(Integer.valueOf(30));

        System.out.println("Final List: " + list);
        System.out.println("Size: " + list.size());
    }
}
