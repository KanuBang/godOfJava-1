package f_lab.godOfJava_1.chap5;

public class OperatorComparision {
    public static void main(String[] args) {
        OperatorComparision operatorComparision = new OperatorComparision();
        operatorComparision.comparision();
        operatorComparision.comparision2();
    }

    public void comparision() {
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;

        System.out.println(intValue1 == intValue2);
        System.out.println(intValue1 == intValue3);

        System.out.println(intValue1 != intValue2);
        System.out.println(intValue1 != intValue3);
    }

    public void comparision2() {
        char charValue = 'a';
        System.out.println(97 == charValue);
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue);
    }
}
