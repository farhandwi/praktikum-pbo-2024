public class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;

    public PartTimeEmployee(String name, int employeeId, double baseSalary, double hourlyWage, int hoursPerWeek) {
        super(name, employeeId, baseSalary);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public double calculateWeeklyPay() {
        return hoursPerWeek * hourlyWage;
    }
}
