# Challenge 07: k-th value from the end of a linked list. 

Paired with Merry Cimakasky. 

## Feature Task:

Given that we are indexing from the null end of the list, a value k should return the value at the index k from the null end. (treating k as the index)

## Approach and Efficiency

Create an array list, iterate over linked list adding each node to the array list. Iterate backward over array list to find the value. Return the value. O(n) space and time.

## Solution
<img src="assets\ll_kth_from_end.jpg">