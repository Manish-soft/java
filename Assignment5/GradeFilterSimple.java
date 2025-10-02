class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String display() {
        return name + ":" + grade;
    }
}
 class GradeFilterSimple {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", "A");
        Student s2 = new Student("Priya", "C");
        Student s3 = new Student("Rohan", "B");

        System.out.print("Qualified Students: ");

      
        System.out.print(s1);  
        System.out.print(", ");
        System.out.print(s3);  
    }
}
