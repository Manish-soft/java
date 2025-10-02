import java.util.*;


class Employee{

String name;
int salary;

Employee(String name , int salary){
this.name=name;
this.salary=salary;
}

public String tostring(){

return name +"   "+ salary;
}
}


class MainEmployeesorting{

public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Amit", 50000));
        employees.add(new Employee("Priya", 60000));
        employees.add(new Employee("Rohan", 45000));

        
        employees.sort((a, b) -> a.salary - b.salary);

        
        System.out.print("Sorted by salary: ");
        System.out.println(employees);
    }


}