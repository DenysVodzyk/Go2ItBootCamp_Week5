package Task5_4__5_5;

import java.time.LocalDate;

public class ClientAdvisor extends Staff {
    private int numberOfClientsToServePerDay;

    public ClientAdvisor() {
    }

    public ClientAdvisor(String name, LocalDate DoB, double salary, int numberOfClientsToServePerDay) {
        super(name, DoB, "Client Advisor", salary);
        this.numberOfClientsToServePerDay = numberOfClientsToServePerDay;
    }

    @Override
    public void takeLunch() {
        super.takeLunch();
        System.out.println("around 12:00 PM, after last client.");
    }

    @Override
    public void leaveHome() {
        super.leaveHome();
        System.out.println("after last client has been served.");
    }

    @Override
    public void showResponsibilityAtBank() {
        super.showResponsibilityAtBank();
        System.out.println("help clients with their questions. Take care of appointments.");
    }

}

