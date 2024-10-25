package f_lab.godOfJava_1.chap7;

public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor array = new ArrayNewFor();
        array.newFor();
        array.twoDimFor();
    }
    public void newFor() {
        int[] oneDim = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int data: oneDim) {
            System.out.println(data);
        }
    }

    public void twoDimFor() {
        int[][] twoDim = {{1,2,3},{4,5,6}};
        int oneCounter = 0;

        for (int[] dimArray : twoDim) {
            int twoCounter = 0;
            for (int data : dimArray) {
                System.out.printf(data + " ");
                twoCounter++;
            }
            oneCounter++;
            System.out.println();
        }
    }
}
