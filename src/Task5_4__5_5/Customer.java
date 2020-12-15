package Task5_4__5_5;

import java.time.LocalDate;

public class Customer extends User {
    private double amountOfMoneyAtTFSAAccount;

    public Customer() {
    }

    public Customer(String name, LocalDate DoB, double amountOfMoneyAtTFSAAccount) {
        super(name, DoB, "Customer");
        this.amountOfMoneyAtTFSAAccount = amountOfMoneyAtTFSAAccount;
    }

    public void setAmountOfMoneyAtTFSAAccount(double amountOfMoneyAtTFSAAccount) {
        this.amountOfMoneyAtTFSAAccount = amountOfMoneyAtTFSAAccount;
    }

    public double withdrawMoneyFromTFSA(double amountToWithdraw) {
        if (amountToWithdraw <= amountOfMoneyAtTFSAAccount) {
            amountOfMoneyAtTFSAAccount -= amountToWithdraw;
            return amountToWithdraw;
        }
        System.out.println("Not enough money on the bank account.");
        return 0;
    }


    public double getAmountOfMoneyAtTFSAAccount() {
        return amountOfMoneyAtTFSAAccount;
    }
}
