package Task3;

public class Main {
    public static void main(String[] args) {
        final Warehouse warehouse = new Warehouse(10, 10, 10);

        final Product p1 = new Product("BoxA", 5, 5, 5);
        final Product p2 = new Product("BoxB", 12, 5, 5);
        final Product p3 = new Product("BoxC", 3, 3, 3);
        final Product p4 = new Product("BoxD", 3, 3, 3);
        final Product p5 = new Product("BoxE", 4, 4, 4);
        final Product p6 = new Product("BoxF", 2, 2, 2);
        final Product p7 = new Product("BoxG", 1, 1, 1);

        warehouse.addProduct(p1);
        warehouse.addProduct(p2);
        warehouse.addProduct(p3);
        warehouse.addProduct(p4);
        warehouse.addProduct(p5);
        warehouse.addProduct(p6);
        warehouse.addProduct(p7);

        warehouse.printAllProducts();
    }
}
