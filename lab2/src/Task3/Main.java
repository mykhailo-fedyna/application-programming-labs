package Task3;

public class Main {
    public static void main(String[] args) {
        final Product p1 = new Product("Ноутбук", 30, 20, 5);
        final Product p2 = new Product("Телефон", 15, 8, 2);
        final Product p3 = new Product("Холодильник", 60, 60, 150);

        final Cell cell1 = new Cell(40, 25, 10); // вміщує ноутбук і телефон
        final Cell cell2 = new Cell(70, 70, 200); // вміщує холодильник

        cell1.addProduct(p1);
        cell1.addProduct(p2);
        cell1.addProduct(p3);

        cell2.addProduct(p3);
        cell2.addProduct(p3);
        cell2.addProduct(p3);
        cell2.addProduct(p3);
        cell2.addProduct(p3);
        cell2.addProduct(p3);

        final Warehouse warehouse = new Warehouse(new Cell[]{cell1, cell2});
        warehouse.showAllProducts();
    }
}
