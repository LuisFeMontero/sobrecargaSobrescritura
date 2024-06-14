public class BankAccountOverdraft extends BankAccount {

    private Double extraAmountWithdrawable;

    public BankAccountOverdraft(String accountOwner, Double extraAmountWithdrawable){
        super(accountOwner);
        this.extraAmountWithdrawable = extraAmountWithdrawable;
    }

    @Override
    public void withdraw(Double amount) {
        if(canIWithdraw(amount)){
            super.withdraw(amount);
        }
    }

    @Override
    public Boolean canIWithdraw(Double amount) {
        return Math.abs(getBalance()) + extraAmountWithdrawable > amount;
    }
}
