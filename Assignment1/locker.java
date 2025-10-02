import java.util.Scanner;

 class locker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter locker number: ");
        int lockerNumber = scanner.nextInt();

        if (lockerNumber % 2 == 0) {
            System.out.println("Even locker number");
        } else {
            System.out.println("Odd locker number");
        }

        
    }
}
