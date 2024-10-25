package f_lab.godOfJava_1.chap6;

public class ControlSwitch {

    public static void main(String[] args) {
        ControlSwitch control = new ControlSwitch();
        System.out.println("switchStatement");
        control.switchStatement(1);
        control.switchStatement(2);
        control.switchStatement(3);
        control.switchStatement(4);
        control.switchStatement(6);

        System.out.println("switchStatement2");
        control.switchStatement2(1);

    }

    public void switchStatement(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel + ": A");
                break;
            case 2:
                System.out.println(numberOfWheel + ": B");
                break;
            case 3:
                System.out.println(numberOfWheel + ": C");
                break;
            case 4:
                System.out.println(numberOfWheel + ": D");
                break;
            default:
                System.out.println(numberOfWheel + ": E");
                break;

        }
    }

    public void switchStatement2(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                System.out.println(numberOfWheel + ": A");
                // break;
            case 2:
                System.out.println(numberOfWheel + ": B");
                // break;
            case 3:
                System.out.println(numberOfWheel + ": C");
                break;
            case 4:
                System.out.println(numberOfWheel + ": D");
                break;
            default:
                System.out.println(numberOfWheel + ": E");
                break;

        }
    }
}
