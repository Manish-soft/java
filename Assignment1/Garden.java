import java.util.Scanner;

 class Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

         System.out.print("Enter the breadth: ");
        int breadth = scanner.nextInt();


        if (length == breadth) {
            System.out.println("square garden");
        } else {
            System.out.println("rectangluar garden");
        }

        
    }
}
