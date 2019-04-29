# Lab 10: Stacks and Queues

## Features: 

1. Create a Node class that has properties for the value stored in the node and a pointer to the next node.
2. Create a Stack class with a top property that creates an empty stack when instantiated. 

    a. Default empty value should be assigned to top when the stack is created. 
    
    b. Define method called push that takes a value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
    
    c. Define a method called pop that does not take an argument. It removes the node from the top of the stack and returns the node's value. 
    
    d. Define a method called peek that does not take an argument. It returns the value of the node located on the top of the stack. 
    
3. Create a Queue class with a front property that creates an empty queue when created. A - D should follow as above but named front, enqueue, dequeue, and peek.

4. Exception or stack traces should not be shown to end user. Catch and handle all exceptions and return printed value or operation and either stops execution or provides user with direction and output.

## Approach:

Modeled after my previous lab, Lab 05: Linked Lists for features 1, 2a, 2b, 3a, and 3b. 

## API 