 class BankAccount {
    
    static String bankName = "CDAC Bank";

   
    static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    
    String accountHolder;

  
    BankAccount(String name) {
        accountHolder = name;
    }
}
 class Mainbankaccount3 {
    public static void main(String[] args) {
        
        BankAccount.displayBankName();

        
        BankAccount account1 = new BankAccount("Manish");
        System.out.println("Account created for: " + account1.accountHolder);
    }
}
