package f_lab.godOfJava_1.chap5;

public class OperatorRelational {

    public static void main(String[] args) {
        OperatorRelational operatorRelational = new OperatorRelational();
        operatorRelational.relational();
    }

    public void relational() {
        int intValue1 = 1;
        int intValue2 = 2;
        System.out.println(intValue1 > intValue2);
        System.out.println(intValue1 < intValue2);
        System.out.println(intValue1 >= intValue2);
        System.out.println(intValue1 <= intValue2);
    }
}
