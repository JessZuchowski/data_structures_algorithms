## Feature Task

Write a function that accepts a string as a parameter and returns the duplicate words. 

## Approach

Break the string down into individual words using .split() to create an array of words. 

Insert words into hashset using .add() which returns false if there is a duplicate.

Loop over array and .add() to hashset, print when false is returned. 

## Solution 

<img src="401/data_structures_algorithms/src/assets/repeated_word.jpg">