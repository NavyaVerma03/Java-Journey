// ArrayList ko Iterator se traverse/remove karo aur ListIterator se forward/backward traverse, insert aur replace karo.
package Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorListIteratorPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        System.out.println("Iterator:");

        while (it.hasNext()) {
            int value = it.next();
            System.out.println(value);

            if(value == 20){
                it.remove();
            }
        }

        ListIterator<Integer> li = list.listIterator();
        System.out.print("Forward: ");
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.print("Backward: ");

       while(li.hasPrevious()){
           System.out.println(li.previous());
       }

       li = list.listIterator();
       li.next();
       li.add(100);

       while (li.hasNext()){
           int value = li.next();

           if(value == 30){
               li.set(200);
           }

       }
        System.out.println("Final List: " + list);
    }
}
