import java.util.Scanner;

class salary{
             
			 public static void main(String agrs[]){
			 Scanner Scanner = new Scanner(System.in);
			 
			
              System.out.print("enter the salary for company1");
              int salary1 = Scanner.nextInt();

              System.out.print("enter the salary for company2");
              int salary2 = Scanner.nextInt();

               System.out.print("enter the salary for company3");
              int salary3 = Scanner.nextInt();

               if(salary1 > salary2){
                 System.out.print("compay1 is highest salary");

                 }else if(salary2 > salary3){
                      System.out.print("company2 is highest salary");
                   }else if(salary3 > salary2){
                      System.out.print("company3  is higesht salary");

}





			 
			 
			 
			 }


}