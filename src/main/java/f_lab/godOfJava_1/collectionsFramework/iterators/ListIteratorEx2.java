package f_lab.godOfJava_1.collectionsFramework.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorEx2 {
    public static void main(String[] args) {
        ArrayList<Object> original = new ArrayList<>(10);
        ArrayList<Object> copy1 = new ArrayList<>(10);
        ArrayList<Object> copy2 = new ArrayList<>(10);

        for(int i = 0; i < 10; i++) {
            original.add(i+"");
        }

        Iterator<Object> iterator = original.iterator();

        while (iterator.hasNext()){
            copy1.add(iterator.next());
        }

        System.out.println("= original에서 copy1으로 복사(copy) = ");
        System.out.println("original:"+original);
        System.out.println("copy1:"+copy1);
        System.out.println();

        iterator = original.iterator(); // iterator은 재새용은 불가능하므로 다시 얻어와야 한다.

        while (iterator.hasNext()){
            copy2.add(iterator.next());
            iterator.remove();
        }

        System.out.println("= original에서 copy2으로 이동(move) = ");
        System.out.println("original:"+original);
        System.out.println("copy2:"+copy2);
    }
}
