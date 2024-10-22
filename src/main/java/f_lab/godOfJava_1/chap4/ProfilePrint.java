package f_lab.godOfJava_1.chap4;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        System.out.println("Start ProfilePrint");
        ProfilePrint profilePrint = new ProfilePrint();
        profilePrint.setName("chanwu");
        profilePrint.setAge((byte)24);
        profilePrint.setMarried(false);

        System.out.println("name = " + profilePrint.getName());
        System.out.println("age = " + profilePrint.getAge());
        System.out.println("married = " + profilePrint.isMarried());
    }
    public byte getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
