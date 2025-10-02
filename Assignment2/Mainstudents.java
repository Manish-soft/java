class Student {
    String name;
    int marks;

    // Static variable to keep track of total students
    static int totalstudents = 0;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        totalstudents++;  // Increment the total number of students created
    }

    // Getter for marks
    int getmarks() {
        return marks;
    }

    // Setter for marks
    void setmarks(int marks) {
        this.marks = marks;
    }

    // Method to check if the student passed (marks >= 35)
    void passed() {
        if (marks >= 35) {
            System.out.println("Student " + name + " Passed");
        } else {
            System.out.println("Student " + name + " Failed");
        }
    }

    // Static method to show total number of students
    static void showTotalstudents() {
        System.out.println("Total students: " + totalstudents);
    }
}

public class Mainstudents {
    public static void main(String[] args) {
        // Create 3 student objects
        Student s1 = new Student("Manish", 78);
        Student s2 = new Student("Isha", 34);
        Student s3 = new Student("Kiran", 68);

        // Display the passing/failing status of each student
        s1.passed();
        s2.passed();
        s3.passed();

        // Show total number of students
        Student.showTotalstudents();
    }
}




