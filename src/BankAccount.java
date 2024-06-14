public class BankAccount {


    private String accountOwner;

    private Double balance;


    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        this.balance = 0.0;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        if(canIWithdraw(amount)){
            balance -= amount;
        }
    }

    public Double getBalance() {
        return balance;
    }

    public Boolean canIWithdraw(Double amount){
        return balance >= amount;
    }
}

