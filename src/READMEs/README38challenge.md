# Depth-First Graph

## Challenge

Create a function that takes in an adjacency list, traverses depth-first, and returns a collection of nodes in pre-order. 

## Approach
1. Declare a set of visited nodes.
2. Declare a stack for traversal.
3. Push the root node into the stack.
4. While the stack is not empty, pop the node.
5. If the set does not contain the node, add to set. 
6. For each node in the graph, push.
7. Return set of visited nodes. 

## Solution

<img src="401/data_structures_algorithms/src/assets/depth_first.jpg">