// Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Total Salary = " + (int)salary);
    }
}

// Manager subclass
class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (salary * 0.20);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

// Developer subclass
class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (salary * 0.10);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}

 class MainEmployeeSalaryDisplay {
    public static void main(String[] args) {
        Employee manager = new Manager("Anita", 50000);
        Employee developer = new Developer("Rohit", 40000);

        manager.displaySalary();
        developer.displaySalary();
    }
}
