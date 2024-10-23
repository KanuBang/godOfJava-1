package f_lab.godOfJava_1.chap5;

public class OperatorTilde {
    public static void main(String[] args) {
        OperatorTilde operator = new OperatorTilde();
        byte b = 127;
        operator.printTildeResult(b);
        b=1;
        operator.printTildeResult(b);
    }

    public void printTildeResult(byte b) {
        System.out.println("Original Value = " + b);
        System.out.println("Tilde Value = " + ~b);
    }
}
