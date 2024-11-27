package f_lab.godOfJava_1.collectionsFramework.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
