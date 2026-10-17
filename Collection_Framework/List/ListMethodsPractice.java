package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("SQl");
        System.out.println(list);
        list.clear();
        System.out.println(list.size());
        System.out.println(list.contains("Python"));
        System.out.println(list.isEmpty());


    }
}
