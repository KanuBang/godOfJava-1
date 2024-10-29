package f_lab.godOfJava_1.chap9.javaPackage;

import f_lab.godOfJava_1.chap9.javaPackage.sub.AccessModifier;

public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        // accessModifier.protectedMethod();
        // accessModifier.packagePrivateMethod;
        // accessModifier.privateMethod();
    }
}
