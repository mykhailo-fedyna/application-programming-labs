package Task2;

public class Pyramid extends Figure3D {
    private final double baseArea;
    private final double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public double getArea() {
        return baseArea;
    }

    @Override
    public double getVolume() {
        return (baseArea * height) / 3;
    }
}
