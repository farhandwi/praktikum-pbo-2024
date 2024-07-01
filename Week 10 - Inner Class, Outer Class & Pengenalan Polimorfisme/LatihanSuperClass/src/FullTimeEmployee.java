public class FullTimeEmployee extends Employee {
    private double annualBonus;

    public FullTimeEmployee(String name, int employeeId, double baseSalary, double annualBonus) {
        super(name, employeeId, baseSalary);
        this.annualBonus = annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public double calculateTotalAnnualCompensation() {
        return getBaseSalary() + annualBonus;
    }
}
