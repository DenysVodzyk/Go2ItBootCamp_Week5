package Task5_2;

public class Triangle extends Shape {

    public Triangle() {
    }

    //assuming triangle is equilateral
    public Triangle(double sideLengthOrRadius) {
        super(sideLengthOrRadius);
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) / 4 * Math.pow(getSideLengthOrRadius(), 2);
    }
}
