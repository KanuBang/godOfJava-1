package f_lab.godOfJava_1.chap9.javaPackage;

import f_lab.godOfJava_1.chap9.javaPackage.sub.Sub;

public class Package {
    public static void main(String[] args) {
        String hello = "안녕하세요";
        System.out.println(hello);

        Mock mock = new Mock();
        Sub sub = new Sub();

        mock.samePackageMethod();
        sub.subClassMethod();
    }
}
