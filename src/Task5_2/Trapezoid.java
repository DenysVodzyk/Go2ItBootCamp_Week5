package Task5_2;

public class Trapezoid extends Square {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Trapezoid() {
    }

    public Trapezoid(double sideA, double sideB, double sideC, double sideD) {
        super(sideA);
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
}
