package f_lab.godOfJava_1.chap7;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength arrayLength = new ArrayLength();
        arrayLength.printArrayLength();
        arrayLength.printArray();
    }
    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];
        System.out.println(oneDim.length);
        System.out.println(twoDim.length);
    }

    public void printArray() {
        int[][] twoDim = {{1,2,3},{4,5,6}};
        System.out.println("twoDim.length=" + twoDim.length);
        System.out.println("twoDim[0].length=" + twoDim[0].length);
        int rows = twoDim.length;
        for(int row = 0; row < rows; row++){
            int cols = twoDim[row].length;
            for(int col = 0; col < cols; col++) {
                System.out.printf("towDim[%d][%d] = %d\n", row, col, twoDim[row][col]);
            }
        }
    }
}
