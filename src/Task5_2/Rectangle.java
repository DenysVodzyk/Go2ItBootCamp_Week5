package Task5_2;

public class Rectangle extends Square {
    private double sideB;

    public Rectangle() {
    }

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }
}
