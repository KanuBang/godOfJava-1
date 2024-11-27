package f_lab.godOfJava_1.collectionsFramework.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

    public static void main(String[] args) {
        final int LIMIT = 10;
        String soruce = "0123456789qwertyuiop[]asdfghjkl;'zxcvbnm,./";
        int length = soruce.length();

        List list = new ArrayList<>(length / LIMIT + 10);

        for(int i = 0; i < length; i += LIMIT) {
            if(i + LIMIT < length) {
                list.add(soruce.substring(i, i+LIMIT));
            } else {
                list.add(soruce.substring(i));
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
