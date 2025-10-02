

class BankAccount {
     String accountHolderName;
     double balance;
    static int interestRate;

    // Static block
    static {
        interestRate = 4;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and Setters
     String getAccountHolderName() {
        return accountHolderName;
    }

     void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

     double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
this.balance = balance;
    }
}

 class Mainbankaccount {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Rohit", 5000);
        BankAccount a2 = new BankAccount("Priya", 15000);

        System.out.println("Account1 name is: " + a1.getAccountHolderName());
        System.out.println("Account2 name is: " + a2.getAccountHolderName());

        // Interest rate is static; we can access it like this:
        System.out.println("Bank interest rate is: " + BankAccount.interestRate + "%");
    }
}











