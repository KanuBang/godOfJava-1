package f_lab.godOfJava_1.chap5;

public class OperatorConditionalTriple {

    public static void main(String[] args) {
        OperatorConditionalTriple operatorConditionalTriple = new OperatorConditionalTriple();
        operatorConditionalTriple.doBlindDate(30);
        operatorConditionalTriple.doBlindDate(80);
    }
    public boolean doBlindDate(int point) {
        boolean doBlindDate = false;
        doBlindDate = (point >= 80) ? true : false;
        System.out.printf("point %d : %b\n", point, doBlindDate);
        return doBlindDate;
    }
}
