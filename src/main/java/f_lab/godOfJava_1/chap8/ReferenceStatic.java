package f_lab.godOfJava_1.chap8;

public class ReferenceStatic {
    String name = "Min";

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("This is a staticMethod");
    }

    // Non-static field 'name' cannot be referenced from a static context
    /*
    public static void staticMethodCallVariable() {
        System.out.println(name);
    }
    */
}
