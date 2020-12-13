package Task5_4__5_5;

public class ClientAdvisor extends Staff {
    private int numberOfClientsToServePerDay;

    public ClientAdvisor() {
    }

    public ClientAdvisor(String name, String dOB, double salary, int numberOfClientsToServePerDay) {
        super(name, dOB, "Client Advisor", salary);
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

