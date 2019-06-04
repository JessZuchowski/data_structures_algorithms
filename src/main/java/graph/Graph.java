package graph;

import java.util.*;

public class Graph {
    //define adjacency list using Map, constructor with getters and setters
    public Map<NodeVertex, List<NodeVertex>> adjacent = new Map<NodeVertex, List<NodeVertex>>() {
        @Override
        public int size() {

            return 0;
        }

        @Override
        public boolean isEmpty() {

            return false;
        }

        @Override
        public boolean containsKey(Object key) {

            return false;
        }

        @Override
        public boolean containsValue(Object value) {

            return false;
        }

        @Override
        public List<NodeVertex> get(Object key) {

            return null;
        }

        @Override
        public List<NodeVertex> put(NodeVertex key, List<NodeVertex> value) {

            return null;
        }

        @Override
        public List<NodeVertex> remove(Object key) {

            return null;
        }

        @Override
        public void putAll(Map<? extends NodeVertex, ? extends List<NodeVertex>> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<NodeVertex> keySet() {

            return null;
        }

        @Override
        public Collection<List<NodeVertex>> values() {

            return null;
        }

        @Override
        public Set<Entry<NodeVertex, List<NodeVertex>>> entrySet() {

            return null;
        }
    };

    //add Node method
    public void addNodeVertex(int vertex) {

        adjacent.putIfAbsent(new NodeVertex(vertex), new ArrayList<>());
    }

    //add Edge method
    public void addEdge(int vertex1, int vertex2) {
        NodeVertex nv1 = new NodeVertex(vertex1);
        NodeVertex nv2 = new NodeVertex(vertex2);
        adjacent.get(nv1).add(nv2);
        adjacent.get(nv2).add(nv1);
    }

    //get Nodes method by traversal, keep track of visited nodes and return as Set
    public Set<Integer> getNodeVertices(Graph graph, int root) {
        Set<Integer> visited = new LinkedHashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int rootVertex = stack.pop();
            if (!visited.contains(rootVertex)) {
                visited.add(rootVertex);
                for (NodeVertex nv : graph.getNeighbors(rootVertex)) {
                    stack.push(nv.vertex);
                }
            }
        }
        return visited;
    }

    //get Neighbors method
    List<NodeVertex> getNeighbors(int vertex) {

        return adjacent.get(new NodeVertex(vertex));
    }

    //get size method
    public int getSize() {
        return adjacent.size();
    }
}
