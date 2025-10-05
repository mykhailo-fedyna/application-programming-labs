package Task3;

public class Warehouse {
    private final Cell[] cells;

    public Warehouse(Cell[] cells) {
        this.cells = cells;
    }

    public void showAllProducts() {
        System.out.println("\n=== Вміст складу ===");
        for (Cell cell : cells) {
            cell.showProducts();
            System.out.println();
        }
    }
}
