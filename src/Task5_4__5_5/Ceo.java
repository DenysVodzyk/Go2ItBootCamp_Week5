package Task5_4__5_5;

import java.time.LocalDate;

public class Ceo extends Staff {
    private double budgetToOperate;

    public Ceo() {
    }

    public Ceo(String name, LocalDate DoB, double salary, double budgetToOperate) {
        super(name, DoB, "CEO", salary);
        this.budgetToOperate = budgetToOperate;
    }

    @Override
    public void leaveHome() {
        super.leaveHome();
        System.out.println("when all of the meetings are over and all day tasks are completed.");
    }

    @Override
    public void takeLunch() {
        super.takeLunch();
        System.out.println("in between the meetings.");
    }

    @Override
    public void showResponsibilityAtBank() {
        super.showResponsibilityAtBank();
        System.out.println("make sure customers and employees are happy. Bank business is growing and tripling each year.");
    }
}

