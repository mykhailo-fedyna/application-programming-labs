package Task1;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<Vertex> vertices = new ArrayList<>();
    private final List<List<Integer>> edges = new ArrayList<>();
    private final boolean directed;

    public Graph(boolean directed) {
        this.directed = directed;
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
        edges.add(new ArrayList<>());
    }

    // Створення дуги між вершинами за індексами
    public void addEdge(int from, int to) {
        if (from >= 0 && from < vertices.size() && to >= 0 && to < vertices.size()) {
            edges.get(from).add(to);
            if (!directed) {
                edges.get(to).add(from);
            }
        } else {
            System.out.println("Invalid vertex index!");
        }
    }

    public void printGraph() {
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i) + " -> ");
            for (int j : edges.get(i)) {
                System.out.print(vertices.get(j) + " ");
            }
            System.out.println();
        }
    }
}
