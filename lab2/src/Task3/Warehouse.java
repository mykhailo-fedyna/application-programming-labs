package Task3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final int cellLength;
    private final int cellWidth;
    private final int cellHeight;
    private final List<Product> products = new ArrayList<>();

    public Warehouse(int cellLength, int cellWidth, int cellHeight) {
        this.cellLength = cellLength;
        this.cellWidth = cellWidth;
        this.cellHeight = cellHeight;
    }

    public void addProduct(Product product) {
        if (product.length > cellLength || product.width > cellWidth || product.height > cellHeight) {
            System.out.println("Error: Product " + product.name + " does not fit in the cell!");
            return;
        }

        if (products.size() >= 5) {
            System.out.println("Error: Cell is full, cannot add product " + product.name + "!");
            return;
        }

        products.add(product);
        System.out.println("Added product: " + product.name);
    }

    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Warehouse is empty.");
        } else {
            System.out.println("Products in warehouse:");
            for (Product p : products) {
                p.printInfo();
            }
        }
    }
}
