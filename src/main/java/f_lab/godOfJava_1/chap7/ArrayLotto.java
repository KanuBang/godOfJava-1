package f_lab.godOfJava_1.chap7;


public class ArrayLotto {
    public static void main(String[] args) {
        ArrayLotto array = new ArrayLotto();
        array.init();
    }

    public void init(){
        int[] lottoNumbers = new int[7];
        for(int i = 0;  i < lottoNumbers.length; i++) {
            lottoNumbers[i] = i * 10;
        }
    }
}
