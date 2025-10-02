import java.util.Scanner;

 class Numberchecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter  number: ");
        int num = sc.nextInt();

       

       
        String result = (num > 0) ? "number is postive"
                        : (num < 0) ? "number is negative"
                          : "Number is Zero";
        System.out.println("the number is: " + result);
    }
}
