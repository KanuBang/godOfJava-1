package f_lab.godOfJava_1.chap8;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumbersWithArray(new int[]{1,2,3,4,5});
        varargs.calculateNumbers(1);
        varargs.calculateNumbers(1,2);
        varargs.calculateNumbers(1,2,3);
        varargs.calculateNumbers(1,2,3,4);
        varargs.calculateNumbers(1,2,3,4,5);
        varargs.arbitrary1("Heelo", 99,100,101);
    }

    public void calculateNumbersWithArray(int[] numbers) {

    }

    public void calculateNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total="+total);
    }

    public void arbitrary1(String msg, int... numbers){
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.printf("msg is %s and total num is %d", msg, total);
    }

    /*
    public void arbitrary2(int... numbers, String msg){

    }

    public void arbitrary3(int... numbers, String... msg){

    }
    */
}
