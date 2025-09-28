package Task2;

public class Pyramid extends Shape {
    private final double baseArea;
    private final double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double area() {
        return baseArea + 0.5 * Math.sqrt(baseArea) * height;
    }

    @Override
    public double volume() {
        return (1.0 / 3) * baseArea * height;
    }
}
