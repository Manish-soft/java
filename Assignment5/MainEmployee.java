
import java.util.*;

class Employee{

String name;
int salary;

Employee(String name, int salary){

this.name = name;
this.salary = salary;
}
public String getname(){
	return name;
	}
	
	public int getsalary(){
		return salary;
		}
		
		@Override
		public String toString(){
		return name+ ":" +(int)salary;	
			
		}


}

class MainEmployee{

public static void main(String[] agrs){

Scanner sc = new Scanner(System.in);

List<Employee> employee = new ArrayList<>();

employee.add(new Employee("Amit"  , 50000));
employee.add(new Employee("priya"  , 50000));
employee.add(new Employee("rahul"  , 50000));
employee.add(new Employee("neha"  , 50000));
employee.add(new Employee("vikram"  , 50000));
employee.add(new Employee("sanya"  , 50000));
employee.add(new Employee("karan"  , 50000));



System.out.println("Employee list:");
for(Employee e : employee){
System.out.println(e);



}

}



}








