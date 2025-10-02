 class Student {

    private int marks;


    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }

  
   int getMarks() {
        return marks;
    }
	
}
  {

    public static void main(String[] args) {
        Student student = new Student();

       
        student.setMarks(85);
        System.out.println("Marks = " + student.getMarks());

      
        student.setMarks(120);  // Should print error
        System.out.println("Marks = " + student.getMarks());  // Should still be 85
    
}
