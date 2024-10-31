package f_lab.godOfJava_1.jvm.staticPractice2;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A count = ",counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B count = ",counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C count = ",counter);
        System.out.println("C count = " + counter.count);
    }
}
