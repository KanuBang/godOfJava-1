package f_lab.godOfJava_1.chap6;

public class ControlElseIfAndTernary {
    public static void main(String[] args) {
        ControlElseIfAndTernary control = new ControlElseIfAndTernary();
        control.elseIf(70);
        control.ternary(70);
    }

    public void elseIf(int point) {
        if(point >= 80) {
            System.out.println("A");
        }
        else if(point >= 60) {
            System.out.println("B");
        }
        else if(point >= 30) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }

    public void ternary(int point) {
        System.out.println(point >= 80 ? "A" : point >= 60 ? "B" : point >= 30 ? "C" : "D");
    }
}
