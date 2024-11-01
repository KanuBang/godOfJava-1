package f_lab.godOfJava_1.jvm.staticMethod1;

public class DecoMain2 {
    public static void main(String[] args) {
        String str = "Hello";
        String decoStr = DecoUtil2.decoStr(str);
        System.out.println("before: " + str);
        System.out.println("after: " + decoStr);
    }
}
