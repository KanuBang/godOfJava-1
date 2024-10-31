package f_lab.godOfJava_1.jvm.staticMethod1;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 decoUtil1 = new DecoUtil1();
        String deco = decoUtil1.decoStr(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
