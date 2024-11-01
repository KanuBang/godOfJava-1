package f_lab.godOfJava_1.jvm.staticMethod2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(DecoData data) {
        //instanceValue++;
        //instanceMethod();
        staticValue++;
        staticMethod();

        data.instanceValue++;
        data.instanceMethod();

        DecoData2 decoData2 = new DecoData2("string");
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
