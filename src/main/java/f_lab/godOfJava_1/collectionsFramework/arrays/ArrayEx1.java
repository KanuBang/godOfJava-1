package f_lab.godOfJava_1.collectionsFramework.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};

        // 배열 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr,0,7);

        // 배열 채우기
        Arrays.fill(arr,9);
        //Arrays.setAll(arr, ()->(int)(Math.random()*5+1));

        int[] newArr = {3,2,0,1,4};
        int idx1 = Arrays.binarySearch(arr, 2); // 잘못된 결과

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx2 = Arrays.binarySearch(arr, 2);


        int[] newArr1 = {0,1,2,3,4};
        int[][] newArr12D = {{11,22},{21,22}};
        System.out.println(newArr1.toString());
        System.out.println(newArr12D.toString());


        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        System.out.println(Arrays.equals(str2D,str2D2));
        System.out.println(Arrays.deepEquals(str2D,str2D2));

        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5); // list add 처럼 크기는 변경할 수 없음
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // 크기가 변경 가능한 배열을 만들자고자 하면...
    }
}
