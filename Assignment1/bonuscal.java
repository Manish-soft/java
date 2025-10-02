import java.util.Scanner;

 class bonuscals{
 
  public static void main(String agrs[]){
  
   Scanner Scanner = new Scanner(System.in);
   
   System.out.print("Enter the salary:");
   double salary = Scanner.nextDouble();
   
   System.out.print("Enter the year:");
   double year = Scanner.nextDouble();
   
   if(year > 5 ){
   
     double bonus = salary * 0.05;
       System.out.print("Bonus amount:" + bonus);
   } 

  
  
  
  
  }
 
 
 
 
 
 
 
 
 
 }