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
}

class Mainstudents1 {
    public static void main(String agrs[]) {

        
        Student s1 = new Student("Manish", 101, 75);

       
        s1.setmarks(88);  

 
        System.out.println("Student's name: " + s1.name);
        System.out.println("Student's roll no: " + s1.rollno);
        System.out.println("Student's marks: " + s1.getmarks());
    }
}
