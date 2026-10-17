package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,100);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(10));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.isEmpty());
    }
}
