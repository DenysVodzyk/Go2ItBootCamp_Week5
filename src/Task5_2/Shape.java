package Task5_2;

public class Shape {
    private double sideLengthOrRadius;

    public Shape() {
    }

    public Shape(double sideLengthOrRadius) {
        this.sideLengthOrRadius = sideLengthOrRadius;
    }

    public double getSideLengthOrRadius() {
        return sideLengthOrRadius;
    }

    public void setSideLengthOrRadius(double sideLengthOrRadius) {
        this.sideLengthOrRadius = sideLengthOrRadius;
    }

    public double calculateArea(double sideLengthOrRadius) {
        System.out.println("If the method is not overriden, and the output is 0, area of the shape is too complicated to calculate for this program.");
        return 0;
    }


}
