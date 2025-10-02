class Bankaccount{

String accountholdername;
double balance;

   Bankaccount(String accountholdername, double balance){
   this.accountholdername=accountholdername;
   this.balance=balance;
  }  
   
     double getbalance(){
	 return balance;
	 }
	 
	 void setbalance(double balance){
	 this.balance = balance;
	 }
	 
}

class Mainbankaccount2{ 
 public static void main(String[] args){

Bankaccount b1 = new Bankaccount("Manish",5000);
   b1.setbalance(6000);
System.out.println("accountholdername" + b1.accountholdername);
System.out.println("accountbalance" + b1.balance);



}

}




