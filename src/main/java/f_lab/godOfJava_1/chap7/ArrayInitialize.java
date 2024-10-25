package f_lab.godOfJava_1.chap7;

public class ArrayInitialize {
    public static void main(String[] args) {
        ArrayInitialize arrayInitialize = new ArrayInitialize();
        arrayInitialize.otherInit();
        System.out.println(arrayInitialize.getMonth(3));
    }
    public void otherInit() {
        int[] lottoNumbers = {5,12,23,25,38,41,2};
        // int[] lottoNumbers2;
        // lottoNumbers = {5,12,23,25,38,41,2}; // compile error
    }

    public String getMonth(int monthInt) {
        String[] month = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return month[monthInt];
    }
}
