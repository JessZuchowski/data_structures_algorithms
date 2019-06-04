package graph;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirst {
    public Set<Integer> breadthFirstTraversal(Graph graph, Integer root) {
        Set<Integer> visited = new LinkedHashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            Integer rootVertex = queue.poll();
            for (NodeVertex nv : graph.getNeighbors(rootVertex)) {
                if (!visited.contains(nv.vertex)) {
                    visited.add(nv.vertex);
                    queue.add(nv.vertex);
                }
            }
        }
        return visited;
    }
}
