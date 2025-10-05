package Task3;

public class Product {
    private final String name;
    private final double length;
    private final double width;
    private final double height;

    public Product(String name, double length, double width, double height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " (" + length + "x" + width + "x" + height + ")";
    }
}
