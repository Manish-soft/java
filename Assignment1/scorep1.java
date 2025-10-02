import java.util.Scanner;


class Scorep1{

 public static void main(String agrs[]){
  Scanner scanner = new Scanner(System.in);
  
    System.out.print("enter the test1 score");
	int score1 = scanner.nextInt();
	
	System.out.print("enter the test2 score");
	int score2 = scanner.nextInt();
	
	if(score1 > score2){
	System.out.print("the score is highest of test1");
	}else if (score2 > score1){
		System.out.print("the score is highest of test2");
		
	}
	
	}
	
 
 
 
 }

