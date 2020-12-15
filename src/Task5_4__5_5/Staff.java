package Task5_4__5_5;

import java.time.LocalDate;

public class Staff extends User {
    private double salary;
    private double shiftStart;
    private double shiftEnd;

    public Staff() {
    }

    public Staff(String name, LocalDate DoB, String position, double salary) {
        super(name, DoB, position);
        this.salary = salary;
    }

    public double getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(double shiftStart) {
        this.shiftStart = shiftStart;
    }

    public double getShiftEnd() {
        return shiftEnd;
    }

    public void setShiftEnd(double shiftEnd) {
        this.shiftEnd = shiftEnd;
    }

    public void wakeUp() {
        System.out.print("Wake Up: ");
    }

    public void sleep() {
        System.out.print("Sleep: ");
    }

    public void takeLunch() {
        System.out.print("Take a lunch: ");
    }

    public void leaveHome() {
        System.out.print("Leave home: ");
    }

    public void showResponsibilityAtBank() {
        System.out.print("Work at bank: ");
    }

}
