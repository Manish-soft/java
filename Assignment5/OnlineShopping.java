import java.util.Scanner;

class OnlineShopping{

public static void main(String[] agrs){

Scanner sc = new Scanner(System.in);

try{

int quantity =sc.nextInt();

int n =sc.nextInt();

double[] prices = new double[n];

for(int i=0; i<n; i++){

prices[i] = sc.nextDouble();
}

int index =sc.nextInt();


 double total = quantity * prices[index];

System.out.println("Total price:"  + total);
}

catch(ArithmeticException e){
System.out.println("ArithmeticExceptionCaught:");

}

catch(ArrayIndexOutOfBoundsException e){

System.out.println("Arithmetic Exception caught :");

}

catch(Exception e){
	System.out.println("other exeception:" + e);
	
}


}

}