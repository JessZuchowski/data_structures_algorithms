# Code Challenge 11: Pseudoqueue

Paired with Michael Jahns. 

## Feature Task:

Create a PseudoQueue class that will implement a queue using two stacks. 

## Approach and Efficiency:

1. Reverse the order of the elements of the stack by using another stack.
2. First check that both stacks are empty.
3. Enqueue: push element to stack 1. 
4. Dequeue: if stack 2 is empty, while stack 1 is not empty, pop from stack 1 and push to stack 2. Return peek from stack 2.

## Solution:

<img src="assets/queue_with_stacks.jpg">