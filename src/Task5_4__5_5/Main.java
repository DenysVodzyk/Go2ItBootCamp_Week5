package Task5_4__5_5;

public class Main {
    public static void main(String[] args) {
        Ceo ceo = new Ceo("CEO #1", "February 30, 1985", 500000, 200000000);
        Janitor janitor = new Janitor("Janitor #1", "April 01, 1970", 35000, 4);

        System.out.println("CEO: ");
        ceo.takeLunch();
        ceo.showResponsibilityAtBank();
        ceo.leaveHome();

        System.out.println("Janitor: ");
        janitor.takeLunch();
        janitor.showResponsibilityAtBank();
        janitor.leaveHome();
    }
}
