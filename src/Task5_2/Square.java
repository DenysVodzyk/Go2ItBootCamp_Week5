package Task5_2;

public class Square extends Quadrilateral {

    public Square() {
    }

    public Square(double sideLengthOrRadius) {
        super(sideLengthOrRadius);
    }

    @Override
    public double calculateArea(double sideLengthOrRadius) {
        return Math.pow(sideLengthOrRadius, 2);
    }
}
