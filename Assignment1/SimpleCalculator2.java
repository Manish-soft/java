import java.util.Scanner;

 class SimpleCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.println("Select operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

 
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

  
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();


        if (choice == 1)
            System.out.println("Result: " + (num1 + num2));
        else if (choice == 2)
            System.out.println("Result: " + (num1 - num2));
        else if (choice == 3)
            System.out.println("Result: " + (num1 * num2));
        else if (choice == 4) {
            if (num2 != 0)
                System.out.println("Result: " + (num1 / num2));
            
        } 
    }
}
