class Bankaccount{

 public double balance;
 
 void deposit(double amount){
 if(amount > 0){
     balance = balance+amount;
}	 
 }
       void withdraw(double amount){
          if(amount <= balance){
		  balance = balance - amount;
		  }else{
		  System.out.println("not balance");
		  }
		  }		  
	   
	       double getbalance(){
		   return balance;
		   }
	 


}

         class mainaccount{
		 
		 public static void main(String agrs[]){
		 
		 Bankaccount b1 = new Bankaccount();
		 
		 b1.deposit(5000);
		 b1.withdraw(2000);
		 
		 System.out.println("reamaning balance is" + b1.getbalance());
		 
		 }
		 
		 
		 
		 
		 
		 }


	 
 
 



