// Write a Java program to create an ArrayList of three strings and print each element using an enhanced for loop.

package Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class istTraversalEasy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Spring Boot");

        for(String lists: list){
            System.out.println(lists);
        }
    }
}
