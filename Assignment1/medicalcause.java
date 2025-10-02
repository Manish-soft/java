import java.util.Scanner;

class medicalCause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Classes held: ");
        int classHeld = sc.nextInt();

        System.out.print("Classes attended: ");
        int classAttended = sc.nextInt();

        System.out.print("Medical cause (Y/N): ");
        char medicalCause = sc.next().charAt(0);


        if (medicalCause == 'Y') {
            System.out.println("You are allowed to sit for the exam.");
        } else {
            System.out.println("You are not allowed to sit for the exam.");
        }

        
    }
}
