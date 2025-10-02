class Employee {
    int id;
    String name;
    double basicsalary;

    static int counter = 1001;

    // Default constructor
    Employee() {
        name = "Unknown";
        basicsalary = 20000;
        id = counter;
        counter++;
    }

    // Parameterized constructor
    Employee(String name, double basicsalary) {
        this.name = name;
        this.basicsalary = basicsalary;
        this.id = counter;
        counter++;
    }

    // Getter methods
    int getid() {
        return id;
    }

    String getname() {
        return name;
    }

    double getbasicsalary() {
        return basicsalary;
 }

    void  calculateNetsalary(){
	
	double hra = 0.10 * basicsalary;
	double da = 0.05 * basicsalary;
	double pf = 0.02 * basicsalary;
	double netSalary = basicsalary + hra + da - pf;
	
	System.out.println("Net Salary of " + name + " (ID: " + id + "): " + netSalary);
	}

}

class MainEmployee2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();  // Default constructor
        Employee e2 = new Employee("Manish", 5000);  // Parameterized constructor

        System.out.println("Employee 1:");
        System.out.println("ID: " + e1.getid());
        System.out.println("Name: " + e1.getname());
        System.out.println("Salary: " + e1.getbasicsalary());

        System.out.println("\nEmployee 2:");
        System.out.println("ID: " + e2.getid());
        System.out.println("Name: " + e2.getname());
        System.out.println("Salary: " + e2.getbasicsalary());
    
	      e1.calculateNetsalary();
		  e2.calculateNetsalary();
	
	}
}
