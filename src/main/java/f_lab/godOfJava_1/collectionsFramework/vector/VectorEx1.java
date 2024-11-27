package f_lab.godOfJava_1.collectionsFramework.vector;

import java.sql.SQLOutput;
import java.util.Vector;

public class VectorEx1 {

    public static void main(String[] args) {

        Vector<Object> objects = new Vector<>(5);
        objects.add("1");
        objects.add("2");
        objects.add("3");
        print(objects);

        objects.trimToSize(); // size와 capacity가 같도록 새로운 인스턴스를 생성한 후 그 시작 주소를 이용
        System.out.println("=== After trimToSize() ===");
        print(objects);

        objects.ensureCapacity(6); // 지정된 capacity에 맡도록 인스턴스를 생성한 후 그 시작 주소를 이용
        System.out.println("=== After ensureCapacity(6) ===");
        print(objects);

        objects.setSize(7); // 지정된 size에 맡도록 인스턴스를 생성한 후 그 시작 주소를 이용. capacity가 충분하지 않다면 새로운 인스턴스를 기존의 크기보다 2배 이상 크게 생성
        System.out.println("=== After setSize(7) ===");
        print(objects);

        objects.clear(); // 초기화
        System.out.println("=== After clear() ===");
        System.out.println(objects);
    }

    private static void print(Vector<Object> objects) {
        System.out.println(objects);
        System.out.println("size: " + objects.size()); // size는 크기 -> 데이터 저장 공간에 데이터가 담견 있는 크기
        System.out.println("capacity: " + objects.capacity()); // capacity는 용량 -> 실제 데이터 저장 공간의 크기
    }
}
