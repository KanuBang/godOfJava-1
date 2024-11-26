package f_lab.godOfJava_1.collectionsFramework.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("myId","1111");
        map.put("asdf","1111");
        map.put("asdf","1111");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = scanner.nextLine().trim();

            System.out.print("password : ");
            String password = scanner.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. " + "다시 입력하세요.");
                continue;
            }

            if(!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치 않습니다. ");
            } else {
                System.out.println("비밀번호와 일치합니다");
                break;
            }
        }
    }
}
