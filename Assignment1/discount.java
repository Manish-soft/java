import java.util.Scanner;

 class discount{
 
  public static void main(String agrs[]){
  
   Scanner Scanner = new Scanner(System.in);
   
   System.out.print("Enter total purchase amount:");
   double amount = Scanner.nextDouble();
   
   if(amount > 1000){
   
   amount = amount -(amount * 0.10 );
   
   } 
    System.out.print("final cost after discount");
  
  
  
  
  }
 
 
 
 
 
 
 
 
 
 }