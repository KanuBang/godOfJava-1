package f_lab.godOfJava_1.jvm.finalPractice;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
        // ERROR data1 = 20;

        final int data2 = 20;
        // ERROR data2 = 30;

        method(30);
    }

    static void method(final int parameter) {
        // ERROR parameter = 40;
    }
}
