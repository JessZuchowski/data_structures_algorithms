package challenges.depthFirst;

import graph.Graph;

import java.util.*;

public class DepthFirst {
    public Map<DepthNode, List<DepthNode>> neighbor = new Map<DepthNode, List<DepthNode>>() {
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
        public List<DepthNode> get(Object key) {
            return null;
        }

        @Override
        public List<DepthNode> put(DepthNode key, List<DepthNode> value) {
            return null;
        }

        @Override
        public List<DepthNode> remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends DepthNode, ? extends List<DepthNode>> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<DepthNode> keySet() {
            return null;
        }

        @Override
        public Collection<List<DepthNode>> values() {
            return null;
        }

        @Override
        public Set<Entry<DepthNode, List<DepthNode>>> entrySet() {
            return null;
        }
    };

    List<DepthNode> getAdjacent(char nodeD) {
        return neighbor.get(new DepthNode(nodeD));
    }

    public Set<Character> depthFirst(Graph graph, char root) {
        Set<Character> visited = new LinkedHashSet<>();
        Stack<Character> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            char node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                for(DepthNode dn : graph.getAdjacent(node)) {
                    stack.push(dn.nodeD);
                }
            }
        }
        return visited;
    }
}
