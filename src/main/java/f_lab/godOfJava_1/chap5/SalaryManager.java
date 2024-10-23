package f_lab.godOfJava_1.chap5;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        double monthlySalary = salaryManager.getMonthlySalary(20000000);
        System.out.println(monthlySalary);
    }

    public double getMonthlySalary(int yearSalary) {
        double monthlySalary = yearSalary / 12.0;
        double tax = this.calculateTax(monthlySalary);
        double nationalPension = this.calculateNationalPension(monthlySalary);
        double healthInsurance = this.calculateHealthInsurance(monthlySalary);
        double totalTax = tax + nationalPension + healthInsurance;
        monthlySalary -= totalTax;
        return monthlySalary;
    }

    public double calculateTax(double monthSalary) {
        return monthSalary * 0.125;
    }

    public double calculateNationalPension(double monthSalary) {
        return monthSalary * 0.081;
    }

    public double calculateHealthInsurance(double monthSalary) {
        return  monthSalary * 0.135;
    }

}