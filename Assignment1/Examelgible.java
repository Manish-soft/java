import java.util.Scanner;

 class Examelgible{
 
  public static void main(String agrs[]){
  
   Scanner Scanner = new Scanner(System.in);
   
   System.out.print("Enter the total class held:");
   double totalclass = Scanner.nextDouble();
   
   System.out.print("Enter the class attended:");
   double attended = Scanner.nextDouble();
   
   if(attended >= 75 ){
   
       System.out.print("you are eligbile");
	   
   }else  {
		   
		   
		 System.out.print("you are not eligbile");
	   }
	   
   

  
  
  }
  
  }
 
 
 