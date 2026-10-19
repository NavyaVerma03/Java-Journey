
package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(1,100);
        list.remove(Integer.valueOf(40));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.isEmpty());


    }
}



