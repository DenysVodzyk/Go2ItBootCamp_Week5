package Task5_4__5_5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Ceo ceo = new Ceo("CEO #1", LocalDate.of(1970, 10, 22), 500000, 200000000);
        Janitor janitor = new Janitor("Janitor #1", LocalDate.of(1960, 10, 22), 35000, 4);
        Customer customer = new Customer("Customer #1", LocalDate.of(1990, 10, 22), 200000);


        System.out.println("CEO: ");
        System.out.println("DoB: " + ceo.getDoB());
        ceo.takeLunch();
        ceo.showResponsibilityAtBank();
        ceo.leaveHome();


        System.out.println("Janitor: ");
        janitor.takeLunch();
        janitor.showResponsibilityAtBank();
        janitor.leaveHome();

        System.out.println("Customer: ");
        System.out.println(customer.getAmountOfMoneyAtTFSAAccount());
        System.out.println(customer.withdrawMoneyFromTFSA(5000));
        System.out.println(customer.getAmountOfMoneyAtTFSAAccount());
        System.out.println(customer.withdrawMoneyFromTFSA(200000));
        System.out.println(customer.getAmountOfMoneyAtTFSAAccount());
    }
}