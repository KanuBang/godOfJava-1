package f_lab.godOfJava_1.chap6;

public class ControlDoWhile {

    public static void main(String[] args) {
        ControlDoWhile controlDoWhile = new ControlDoWhile();
        controlDoWhile.doWhile();
    }

    public void doWhile() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;

        do {
            loop++;
            control.switchCalendar(loop);
        } while (loop < 12);
    }
}
