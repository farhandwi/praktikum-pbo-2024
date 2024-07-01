public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 1001, 50000, 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 1002, 20000, 20, 25);

        System.out.println("Full Time Employee:");
        System.out.println("Name: " + fullTimeEmployee.getName());
        System.out.println("Employee ID: " + fullTimeEmployee.getEmployeeId());
        System.out.println("Base Salary: " + fullTimeEmployee.getBaseSalary());
        System.out.println("Annual Bonus: " + fullTimeEmployee.getAnnualBonus());
        System.out.println("Total Annual Compensation: " + fullTimeEmployee.calculateTotalAnnualCompensation());

        System.out.println("\nPart Time Employee:");
        System.out.println("Name: " + partTimeEmployee.getName());
        System.out.println("Employee ID: " + partTimeEmployee.getEmployeeId());
        System.out.println("Base Salary: " + partTimeEmployee.getBaseSalary());
        System.out.println("Hourly Wage: " + partTimeEmployee.getHourlyWage());
        System.out.println("Hours Per Week: " + partTimeEmployee.getHoursPerWeek());
        System.out.println("Weekly Pay: " + partTimeEmployee.calculateWeeklyPay());
    }
}
