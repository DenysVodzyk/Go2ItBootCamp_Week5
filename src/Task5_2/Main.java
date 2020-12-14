package Task5_2;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Trapezoid trapezoid = new Trapezoid(20, 15, 10, 30, 12);
        System.out.println("Circle radius is: " + circle.getSideLengthOrRadius() + " mm.");

        double areaOfCircle = circle.calculateArea();
        System.out.println(String.format("Area of circle is %.2f", areaOfCircle) + "mm^2");

        double areaOfTrapezoid = trapezoid.calculateArea();
        System.out.println(String.format("Area of trapezoid is %.2f", areaOfTrapezoid) + "mm^2");

    }
}
