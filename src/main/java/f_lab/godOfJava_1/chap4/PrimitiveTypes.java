package f_lab.godOfJava_1.chap4;

public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        primitiveTypes.checkByte();
        primitiveTypes.checkOtherTypes();
        primitiveTypes.checkChar();
        primitiveTypes.initLocalValue1();
        primitiveTypes.initLocalValue2();
    }

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin : " + byteMin);
        System.out.println("byteMax : " + byteMax);
        byteMin = (byte)(byteMin-1);
        byteMax = (byte)(byteMax+1);
        System.out.println("byteMin-1 : " + byteMin);
        System.out.println("byteMax+1 : " + byteMax);
    }

    public void checkOtherTypes() {
        short shortMax = 32762;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        System.out.println("shortMax : " + shortMax);
        System.out.println("intMax : " + intMax);
        System.out.println("longMax : " + longMax);
    }

    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        int intValue = 'a';
        char korean = '가';
        System.out.printf("charMin = [%c]\n", charMin);
        System.out.printf("charMax = [%c]\n", charMax);
        System.out.printf("intValue = %d\n", intValue);
        System.out.printf("korean = %c\n", korean);
    }

    public void initLocalValue1() {
        int default2;
    }

    public void initLocalValue2() {
        int default2 = 0;
        System.out.println(default2);
    }
}
