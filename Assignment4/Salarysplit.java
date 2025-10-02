import java.util.Scanner;
class salarysplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Bonus Amount: ");
       int b=sc.nextInt();
      System.out.println("Enter number of Employees : ");
       int n=sc.nextInt();
       try{
          int d=b/n;
          System.out.println("The bonus to each employee is RS. "+d);
          n=0;
           
       }catch(ArithmeticException e){
      System.out.println("Bonus cannot be divided by zero"); 
       }
        
        
    }
}