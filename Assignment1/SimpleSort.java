import java.util.Scanner;

 class SimpleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

 
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Ascending order: " + a + ", " + b + ", " + c);

        scanner.close();
    }
}
