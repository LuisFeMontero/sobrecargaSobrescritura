public class BankAccountCommission extends BankAccount {


    private Double commission;

    public BankAccountCommission(String accountOwner, Double commission) {
        super(accountOwner);
        this.commission = commission;
    }

    @Override
    public void withdraw(Double amount){
        Double realWithdraw = amount + (amount*commission);
        super.withdraw(realWithdraw);
    }
    //Sobreescritura

    public void deposit(Check check) {
        super.deposit(check.getAmount());
    }
    //Sobrecarga
}
