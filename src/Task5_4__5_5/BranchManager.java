package Task5_4__5_5;

public class BranchManager extends Staff {
    private int amountOfEmployeesAtBranch;

    public BranchManager() {
    }

    public BranchManager(String name, String dOB, double salary, int amountOfEmployeesAtBranch) {
        super(name, dOB, "Client Advisor", salary);
        this.amountOfEmployeesAtBranch = amountOfEmployeesAtBranch;
    }

    @Override
    public void takeLunch() {
        super.takeLunch();
        System.out.println("around 12:00 PM, after making sure there are no complaints from customers.");
    }

    @Override
    public void leaveHome() {
        super.leaveHome();
        System.out.println("after last employee is gone.");
    }

    @Override
    public void showResponsibilityAtBank() {
        super.showResponsibilityAtBank();
        System.out.println("resolve customer's issues.");
    }
}
