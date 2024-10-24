package f_lab.godOfJava_1.chap6;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile controlWhile = new ControlWhile();
        controlWhile.whileLoop();
        controlWhile.whileBreak();
    }

    public void whileLoop() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while(loop < 12) {
            loop++;
            control.switchCalendar(loop);
        }
    }

    public void whileBreak() {
        ControlOfFlow control = new ControlOfFlow();
        int loop = 0;
        while(loop < 12) {
            loop++;
            control.switchCalendar(loop);
            if(loop == 6) break;
        }
    }
}
