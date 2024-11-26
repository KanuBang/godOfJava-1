package f_lab.godOfJava_1.collectionsFramework.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetLotto {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        for(int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }


    }
}
