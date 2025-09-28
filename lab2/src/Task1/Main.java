package Task1;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(true); // true - орієнтований, false - неорієнтований

        graph.addVertex(new Vertex("A", 7));
        graph.addVertex(new Vertex("D", 3));
        graph.addVertex(new Vertex("B", 4));
        graph.addVertex(new Vertex("C", 9));

        graph.addEdge(0, 3);
        graph.addEdge(2, 0);
        graph.addEdge(1, 2);


        System.out.println("Graph:");
        graph.printGraph();
    }
}
