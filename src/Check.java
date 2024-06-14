public class Check {

    private String checkOwner;
    private  Double amount;

    public Check(String checkOwner, Double amount) {
        this.checkOwner = checkOwner;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }
}
