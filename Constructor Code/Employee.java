 class Employee {
    
    String name;
    double salary;
    int yearsOfService;
    static int totalEmployees = 0;

   
    Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;
    }

   
    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    int getYearsOfService() {
        return yearsOfService;
    }


    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setYearsOfService(int years) {
        this.yearsOfService = years;
    }


    double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05;
        } else {
            return 0.0;
        }
    }

    static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ravi", 150000, 6);
        Employee emp2 = new Employee("Anita", 120000, 3);
        Employee emp3 = new Employee("Suresh", 100000, 5);

        System.out.println("Employee " + emp1.getName() + " Bonus: " + emp1.calculateBonus());
        System.out.println("Employee " + emp2.getName() + " Bonus: " + emp2.calculateBonus());
        System.out.println("Employee " + emp3.getName() + " Bonus: " + emp3.calculateBonus());

        Employee.showTotalEmployees();
    }
}
