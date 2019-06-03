# Code Challenge 16: FizzBuzzTree

## Feature Challenge:

Write a function called FizzBuzzTree that takes in a tree as an argument. Determine whether or not each node's value is divisible by 3, 5, or both. Change the value of the node: %3 -> Fizz, %5 -> Buzz, %Both -> FizzBuzz. Return the new tree. 

## Approach and Efficiency:

Traverse a binary tree recursively.
If node value %3==0, change value to Fizz,
If node value %5==0, change value to Buzz, 
If node value %15==0, change value to FizzBuzz, 
Else return value. 

## Solution: 

<img src="\assets/fizz_buzz_tree.jpg">