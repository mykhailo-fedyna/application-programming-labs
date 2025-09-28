package Task3;

public class Product {
    public final String name;
    public final int length;
    public final int width;
    public final int height;

    public Product(String name, int length, int width, int height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("Product: " + name + ", Size: " + length + "x" + width + "x" + height);
    }
}
