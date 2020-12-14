package Task5_2;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(double sideLengthOrRadius) {
        super(sideLengthOrRadius);
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(getSideLengthOrRadius(),2);
    }
}
