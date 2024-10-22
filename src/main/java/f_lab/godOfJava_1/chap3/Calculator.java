package f_lab.godOfJava_1.chap3;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Start Calculator");
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;
        System.out.println("add = " + calculator.add(a,b));
        System.out.println("subtract = " + calculator.subtract(a,b));
        System.out.println("multiply = " + calculator.multiply(a,b));
        System.out.println("divide = " + calculator.divide(a,b));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }
}
