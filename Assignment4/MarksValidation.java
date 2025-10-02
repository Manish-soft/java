import java.util.Scanner;

class MarksValidation {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                throw new Exception("Invalid marks");
            }

            System.out.println("Marks are valid: " + marks);
            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
