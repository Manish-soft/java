import java.util.Scanner;

 class Voting  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a age: ");
        int age = sc.nextInt();

 
        String result = (age > 20) ? "eligble" : "not eligble";

   
        System.out.println(result);
    }
}
