// Abstract base class
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();
}

// Interface for bonus eligibility
interface BonusEligible {
    double calculateBonus();
}

// PermanentEmployee class
class PermanentEmployee extends Employee implements BonusEligible {
    private double basicSalary;
    private double hra;

    public PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        // 10% of salary as bonus
        return calculateSalary() * 0.10;
    }
}

// ContractEmployee class
class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create permanent employees
        PermanentEmployee e1 = new PermanentEmployee("Amit", 101, 50000, 5000);
        PermanentEmployee e2 = new PermanentEmployee("Riya", 102, 60000, 6000);

        // Create contract employees
        ContractEmployee c1 = new ContractEmployee("Neha", 201, 300, 100);
        ContractEmployee c2 = new ContractEmployee("Raj", 202, 250, 120);

        // Display info for permanent employees
        System.out.println(e1.name + " Salary = " + e1.calculateSalary() + ", Bonus = " + e1.calculateBonus());
        System.out.println(e2.name + " Salary = " + e2.calculateSalary() + ", Bonus = " + e2.calculateBonus());

        // Display info for contract employees
        System.out.println(c1.name + " Salary = " + c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + c2.calculateSalary());
    }
}
