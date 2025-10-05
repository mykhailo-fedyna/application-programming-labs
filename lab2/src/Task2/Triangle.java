package Task2;

public class Triangle extends Figure2D {
    private final double a, b, c, height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (a * height) / 2;
    }
}
