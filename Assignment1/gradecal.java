import java.util.Scanner;

public class gradecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the marks: ");
        double marks = scanner.nextDouble();

        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 76) {
            grade = "A";
        } else if (marks >= 66) {
            grade = "B+";
        } else if (marks >= 51) {
            grade = "B";
        } else if (marks >= 36) {
            grade = "C";
        } else {
            grade = "Fail";
        }

       
        System.out.println("Grade: " + grade);

        
    }
}
