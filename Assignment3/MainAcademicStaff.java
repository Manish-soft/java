
class Staff {
    String name;
    double salary;

    
    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}


class TeachingStaff extends Staff {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);  
        this.subject = subject;
    }

    void display() {
        System.out.println(name + " → " + subject + ", " + (int)salary);
    }
}

class NonTeachingStaff extends Staff {
    String department;

    NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);  
        this.department = department;
    }

    void display() {
        System.out.println(name + " → " + department + ", " + (int)salary);
    }
}
 class MainAcademicStaff {
    public static void main(String[] args) {
       
        TeachingStaff ts = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff nts = new NonTeachingStaff("Ramesh", 40000, "Admin");

        
        ts.display();
        nts.display();
    }
}
