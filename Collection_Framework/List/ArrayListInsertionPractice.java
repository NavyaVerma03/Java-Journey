package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInsertionPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.set(2,99));
        System.out.println(list);
        System.out.println(list.contains(99));
        System.out.println(list.indexOf(30));
        System.out.println(list.size());
    }
}
