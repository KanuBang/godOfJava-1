package f_lab.godOfJava_1.jvm.staticMethod2;

public class DecoData2 {
    private String str;

    public DecoData2(String str) {
        this.str = str;
    }

    public String decoStr(){
        return str + "&&&";
    }
}
