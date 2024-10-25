package f_lab.godOfJava_1.chap6;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();

        System.out.println("1일 간격으로 변경");
        for(int i = 1; i <= 365; i++) {
            System.out.println(interestManager.calculateAmount(i,1000000));
        }

        System.out.println("10일 간격으로 변경");
        for(int i = 10; i <= 365; i+=10) {
            System.out.println(interestManager.calculateAmount(i,1000000));
        }
    }

    public double getInterestRate(int day){
        double interestRate = 0;
        if (day <= 90) {
            interestRate = 0.005;
        }
        else if(day <= 180) {
            interestRate = 0.01;
        }
        else if(day <= 364) {
            interestRate = 0.02;
        }
        else {
            interestRate = 0.056;
        }

        return interestRate;
    }

    public double calculateAmount(int day, int amount) {
        double interestRate = this.getInterestRate(day);
        return amount + amount * interestRate;
    }
}
