package Task5_2;

public class Rectangle extends Square {
    private double otherSide;

    public Rectangle() {
    }

    public Rectangle(double sideLengthOrRadius, double otherSide) {
        super(sideLengthOrRadius);
        this.otherSide = otherSide;
    }

    @Override
    public double calculateArea() {
        return getSideLengthOrRadius() * getOtherSide();
    }

    public double getOtherSide() {
        return otherSide;
    }
}
