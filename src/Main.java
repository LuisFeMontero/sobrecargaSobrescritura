//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        BankAccountCommission bankAccountCommission = new BankAccountCommission("Juan", 0.01);

        BankAccountOverdraft bankAccountOverdraft = new BankAccountOverdraft("Juan", 1000.0);


        bankAccountOverdraft.deposit(700.0);
        bankAccountCommission.deposit(700.0);

        bankAccountOverdraft.withdraw(1200.0);
        bankAccountCommission.withdraw(100.0);

        Check check = new Check("Nicolás", 3000.0);
        bankAccountCommission.deposit(check);



    }
}