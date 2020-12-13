package Task5_4__5_5;

public class Customer extends User {
    private double amountOfMoneyOnAccount;
    private String operationToPerformAtBank;

    public Customer() {
    }

    public Customer(String name, String dOB, double amountOfMoneyOnAccount) {
        super(name, dOB, "Customer");
        this.amountOfMoneyOnAccount = amountOfMoneyOnAccount;
    }

    public String getOperationToPerformAtBank() {
        return operationToPerformAtBank;
    }

    public void setOperationToPerformAtBank(String operationToPerformAtBank) {
        this.operationToPerformAtBank = operationToPerformAtBank;
    }

    public double getAmountOfMoneyOnAccount() {
        return amountOfMoneyOnAccount;
    }
}
