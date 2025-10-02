// Abstract base class
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to be implemented in subclasses
    abstract void calculateBonus();
}

// Manager
class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println(name + " Bonus = " + (int)bonus);
    }
}

// Developer 
class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println(name + " Bonus = " + (int)bonus);
    }
}

 class MainEmployeeBonus {
    public static void main(String[] args) {
        Employee manager = new Manager("Anita", 50000);
        Employee developer = new Developer("Rohit", 40000);

        manager.calculateBonus();
        developer.calculateBonus();
    }
}
