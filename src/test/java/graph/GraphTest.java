package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph createGraph() {

    Graph graph = new Graph();

        graph.addNodeVertex(1);
        graph.addNodeVertex(3);
        graph.addNodeVertex(5);
        graph.addNodeVertex(7);

        graph.addEdge(1, 7);
        graph.addEdge(3, 7);
        graph.addEdge(5, 7);
        graph.addEdge(3, 5);

        return graph;

    }
}
