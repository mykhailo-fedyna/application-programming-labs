package Task3;

public class Cell {
    private final double length;
    private final double width;
    private final double height;
    private final Product[] products = new Product[5];
    private int count = 0;

    public Cell(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void addProduct(Product product) {
        if (product.getLength() > this.length ||
                product.getWidth() > this.width ||
                product.getHeight() > this.height) {
            System.out.println("Помилка: товар " + product.getName() + " не вміщується у комірку!");
            return;
        }

        if (count >= 5) {
            System.out.println("Помилка: комірка заповнена! Неможливо додати більше товарів.");
            return;
        }

        products[count] = product;
        count++;
        System.out.println("Товар " + product.getName() + " успішно додано у комірку.");
    }

    public void showProducts() {
        System.out.println("Комірка (" + length + "x" + width + "x" + height + "):");
        if (count == 0) {
            System.out.println("  Порожня");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("  - " + products[i]);
            }
        }
    }
}
