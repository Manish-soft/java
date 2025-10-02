import java.util.Scanner;

 class passfail  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

 
        String result = (num >=35) ? "pass" : "fail";

   
        System.out.println(result);
    }
}
