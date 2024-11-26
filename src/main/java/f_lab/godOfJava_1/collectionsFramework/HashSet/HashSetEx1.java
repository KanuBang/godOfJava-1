package f_lab.godOfJava_1.collectionsFramework.HashSet;

import java.util.HashSet;

public class HashSetEx1 {

    public static void main(String[] args) {
        Object[] objArr = {"1", 1, "2", "2", "2", "3", "3", "4", "4", "4"};
        HashSet<Object> set = new HashSet<>();

        for(int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);
        }

        System.out.println(set);
    }
}
