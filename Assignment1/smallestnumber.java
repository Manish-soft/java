import java.util.Scanner;

class smallestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter a third number: ");
        int num3 = sc.nextInt();


        int smallest = (num1 < num2) 
                        ? ((num1 < num3) ? num1 : num3) 
                        : ((num2 < num3) ? num2 : num3);

       
        System.out.println("Smallest number: " + smallest);
    }
}
