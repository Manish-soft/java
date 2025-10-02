 class Employee {
    String name;
    double basicsalary;

    Employee(String name, double basicsalary) {
        this.name = name;
        this.basicsalary = basicsalary;
    }

    double getNetsalary() {
        return basicsalary;
    }
}

// RegularEmployee class
class RegularEmployee extends Employee {
    RegularEmployee(String name, double basicsalary) {
        super(name, basicsalary);
    }

    double getNetsalary() {
        return basicsalary + (0.10 * basicsalary);
    }
}

// ContractEmployee class
class ContractEmployee extends Employee {
    ContractEmployee(String name, double basicsalary) {
        super(name, basicsalary);
    }

    double getNetsalary() {
        return basicsalary + (0.05 * basicsalary);
    }
}

// Main class
 class MainEmployee1 {
    public static void main(String[] args) {
        // Create employee objects
        RegularEmployee emp1 = new RegularEmployee("Rahul", 20000);
        ContractEmployee emp2 = new ContractEmployee("Riya", 15000);

        // Print net salaries
        System.out.println(emp1.name + " Net Salary = " + (int)emp1.getNetsalary());
        System.out.println(emp2.name + " Net Salary = " + (int)emp2.getNetsalary());
    }
}
