
class Account {
    int accountNo;
    double balance;

    
    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    
    public void display() {
        System.out.println("Account No: " + accountNo + ", Balance: " + balance);
    }
}


class SavingAccount extends Account {
    double interestRate;

    SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    @Override
   public  void display() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}


class CurrentAccount extends Account {
    double overdraftLimit;

     CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void display() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}
 class  MainBankAccountTest {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount(101, 5000, 5.0);
        CurrentAccount current = new CurrentAccount(102, 10000, 2000);

        saving.display();
        current.display();
    }
}
