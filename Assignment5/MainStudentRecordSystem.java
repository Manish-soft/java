import java.util.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + ":" + grade;
    }
}

 class MainStudentRecordSystem {
    public static void main(String[] args) {
       
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "B"));

       
        System.out.print("Student Records: ");
        System.out.print(students.get(0));
        System.out.print(", ");
        System.out.print(students.get(1));
    }
}
