class Student {
    String name;
    int rollno;
    int marks;

    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    int getmarks() {
        return marks;
    }

    void setmarks(int marks) {
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";  
        }
    }
}

class Mainstudentsgrade {
    public static void main(String agrs[]) {

        Student s1 = new Student("Manish", 101, 75);

        s1.setmarks(88);  

        System.out.println("Student's name: " + s1.name);
        System.out.println("Student's roll no: " + s1.rollno);
        System.out.println("Student's marks: " + s1.getmarks());
        System.out.println("Student's grade: " + s1.calculateGrade());
    }
}
