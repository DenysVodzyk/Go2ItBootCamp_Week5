package Task5_2;

public class Trapezoid extends Square {
    private double sideLengthRight;
    private double sideLengthTop;
    private double sideLengthBottom;
    private double height;

    public Trapezoid() {
    }

    public Trapezoid(double sideLengthLeft, double sideLengthRight, double sideLengthTop, double sideLengthBottom, double height) {
        super(sideLengthLeft);
        this.sideLengthRight = sideLengthRight;
        this.sideLengthTop = sideLengthTop;
        this.sideLengthBottom = sideLengthBottom;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (getSideLengthBottom() + getSideLengthTop()) * height / 2;
    }

    public double getSideLengthRight() {
        return sideLengthRight;
    }

    public double getSideLengthTop() {
        return sideLengthTop;
    }

    public double getSideLengthBottom() {
        return sideLengthBottom;
    }

    public double getHeight() {
        return height;
    }
}
