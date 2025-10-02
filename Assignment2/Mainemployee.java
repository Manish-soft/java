class Employee {
    
    String name;
    double salary;
    int yearOfService;

 
    static int totalEmployees = 0;


    Employee(String name, double salary, int yearOfService) {
        this.name = name;
        this.salary = salary;
        this.yearOfService = yearOfService;
        totalEmployees++;  // Increment the total number of employees created
    }

  
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

 
    double getSalary() {
        return salary;
    }

    
    void setSalary(double salary) {
        this.salary = salary;
    }


    int getYearOfService() {
        return yearOfService;
    }

    
    void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    // Method to calculate bonus (5% of salary if years of service > 5)
    double calculateBonus() {
        return yearOfService > 5 ? salary * 0.05 : 0.0;
    }

    // Static method to show the total number of employees
    static void showTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }
}
 class Mainemployee {
    public static void main(String[] args) {
        // Create 3 employees
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 3);
        Employee e3 = new Employee("Suresh", 100000, 5);

        // Print bonuses for each employee
        System.out.println("Employee " + e1.getName() + " Bonus: " + e1.calculateBonus());
        System.out.println("Employee " + e2.getName() + " Bonus: " + e2.calculateBonus());
        System.out.println("Employee " + e3.getName() + " Bonus: " + e3.calculateBonus());

        // Show total number of employees
        Employee.showTotalEmployees();
    }
}

	 
	 
	 








