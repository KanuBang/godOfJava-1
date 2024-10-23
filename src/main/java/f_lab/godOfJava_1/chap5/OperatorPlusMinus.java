package f_lab.godOfJava_1.chap5;

public class OperatorPlusMinus {

    public static void main(String[] args) {
        OperatorPlusMinus operatorPlusMinus = new OperatorPlusMinus();
        operatorPlusMinus.additive();
        operatorPlusMinus.multipleDivision();
        operatorPlusMinus.divideInt();
        operatorPlusMinus.divideDouble();
        operatorPlusMinus.remainder();
    }
    public void additive() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 + intValue2;
        System.out.println(result);
        result = intValue1 - intValue2;
        System.out.println(result);

    }

    public void multipleDivision() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 * intValue2;
        System.out.println(result);
        result = intValue2 / intValue1;
        System.out.println(result);
    }

    public void divideInt() {
        int intValue1 = 5;
        int intValue2 = 10;
        System.out.println(intValue1 / intValue2);
    }

    public void divideDouble() {
        double intValue1 = 5;
        double intValue2 = 10;
        System.out.println(intValue1 / intValue2);
    }

    public void remainder() {
        int intValue1 = 53;
        int intValue2 = 10;
        System.out.println(intValue1 % intValue2);
    }
}
