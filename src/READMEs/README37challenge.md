# Find Edges

## Challenge

Given a map of cities(vertices) and prices(edges), return whether or not direct flights are possible and the cost. 

## Approach
1. Take in a graph with string vertices and edge int values.
2. Take in an array of strings (cities).
3. Traverse the graph, keeping track of visited vertices and edges. 
4. Add vertices and edges to stack as visited. 
5. A full round of pushes and pops returns true.
6. Return sum of edges. 

## Solution

<img src="401/data_structures_algorithms/src/assets/get_edges.jpg">