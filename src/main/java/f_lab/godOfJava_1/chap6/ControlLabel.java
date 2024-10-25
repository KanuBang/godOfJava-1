package f_lab.godOfJava_1.chap6;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel controlLabel = new ControlLabel();
        controlLabel.printTimesTable();
        controlLabel.printTimesTableSkip4Case1();
        controlLabel.printTimesTableSkip4Case2();
        controlLabel.printTimesTableSkip4Case3();
        controlLabel.printTimesTableSkip4Case4();
    }

    public void printTimesTable() {
        for(int level = 2; level<10; level++) {
            for(int unit = 1; unit<10; unit++) {
                System.out.print(level + "*" + unit + "=" + level*unit +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printTimesTableSkip4Case1() {
        for(int level = 2; level < 10; level++) {
            for(int unit = 1; unit < 10; unit++) {
                if(level == 4 || unit == 4) continue;
                System.out.print(level + "*" + unit + "=" + level*unit +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printTimesTableSkip4Case2() {
        for(int level = 2; level < 10; level++) {
            if(level == 4) continue;
            for(int unit = 1; unit < 10; unit++) {
                if(unit == 4) continue;
                System.out.print(level + "*" + unit + "=" + level*unit +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printTimesTableSkip4Case3() {
        for(int level = 2; level < 10; level++) {
            for(int unit = 1; unit < 10; unit++) {
                if(unit == 4) break;
                System.out.print(level + "*" + unit + "=" + level*unit +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printTimesTableSkip4Case4() {

        startLabel:
        for(int level = 2; level < 10; level++) {
            for(int unit = 1; unit < 10; unit++) {
                if(unit == 4) continue startLabel;;
                System.out.print(level + "*" + unit + "=" + level*unit +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
