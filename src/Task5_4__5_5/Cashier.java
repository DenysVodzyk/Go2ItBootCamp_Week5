package Task5_4__5_5;

public class Cashier extends Staff {
    private double amountOfMoneyInRegister;

    public Cashier() {
    }

    public Cashier(String name, String dOB, double salary, double amountOfMoneyInRegister) {
        super(name, dOB, "Cashier", salary);
        this.amountOfMoneyInRegister = amountOfMoneyInRegister;
    }

    @Override
    public void takeLunch() {
        super.takeLunch();
        System.out.println(" at 12:00 PM");
    }

    @Override
    public void leaveHome() {
        super.leaveHome();
        System.out.println("when shift ends: " + getShiftEnd());
    }

    @Override
    public void showResponsibilityAtBank() {
        super.showResponsibilityAtBank();
        System.out.println("Deposit money from customer to the bank and withdraw money from bank to the customer.");
    }
}
