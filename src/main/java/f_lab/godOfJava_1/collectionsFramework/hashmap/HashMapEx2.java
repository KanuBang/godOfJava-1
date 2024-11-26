package f_lab.godOfJava_1.collectionsFramework.hashmap;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set<Map.Entry<Object, Object>> set = map.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry e = (Map.Entry)iterator.next();
            System.out.println("이름 : " + e.getKey() +", 점수 : " + e.getKey());
        }

        Set<Object> set2 = map.keySet();
        System.out.println("참가자 명단 : " + set2);

        Collection<Object> values = map.values();
        Iterator<Object> iterator1 = values.iterator();

        int total = 0;
        while (iterator1.hasNext()) {
            int next = (int) iterator1.next();
            total += next;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
    }
}
