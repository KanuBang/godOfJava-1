package f_lab.godOfJava_1.chap3;

public class Profile {
    String name;
    int age;

    public static void main(String[] args) {
        System.out.println("Start Profile");
        Profile profile = new Profile();
        profile.setName("Min");
        profile.setAge(20);
        profile.printName();
        profile.printAge();
    }
    public void setName(String str){
        this.name = str;
    }

    public void setAge(int val){
        this.age = val;
    }

    public void printName() {
        System.out.println("My name is = " + this.name);
    }

    public void printAge() {
        System.out.println("My age is = " + this.age);
    }
}
