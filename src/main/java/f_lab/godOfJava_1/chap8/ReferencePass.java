package f_lab.godOfJava_1.chap8;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass referencePass = new ReferencePass();
        // referencePass.callPassByValue();
        referencePass.callPassByReference();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
        passByValue(a,b);
        System.out.println("after passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public void callPassByReference() {
        MemberDto member = new MemberDto("Sangmin");
        System.out.println("before passByReference");
        System.out.println("member.name="+member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name="+member.name);

    }

    public void passByReference(MemberDto member) {
        member.name = "Mess";
        System.out.println("in passByReference");
        System.out.println("member.name="+member.name);
    }
}
