package Task5_4__5_5;

import java.time.LocalDate;

public class Janitor extends Staff {
    private int amountOfMopsAvailable;

    public Janitor() {
    }

    public Janitor(String name, LocalDate DoB, double salary, int amountOfMopsAvailable) {
        super(name, DoB, "Janitor", salary);
        this.amountOfMopsAvailable = amountOfMopsAvailable;
    }

    @Override
    public void takeLunch() {
        super.takeLunch();
        System.out.println("around 12:00 PM, after making sure that floors are clean.");
    }

    @Override
    public void leaveHome() {
        super.leaveHome();
        System.out.println("after last client leaves and floors are clean.");
    }

    @Override
    public void showResponsibilityAtBank() {
        super.showResponsibilityAtBank();
        System.out.println("clean floors and washrooms in the bank.");
    }
}
