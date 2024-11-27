package f_lab.godOfJava_1.collectionsFramework.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator<Object> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println();

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println();
    }
}
