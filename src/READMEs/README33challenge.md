# Left Join

## Challenge

Write a function that left joins two hashmaps into a single data structure. 

## Approach
1. Add all keys and values of left (1st) hashmap to ArrayList. 
2. If key of right (2nd) hashmap matches key of 1st, add only value to ArrayList.
3. If key of 2nd doesn't match key of first, add null to ArrayList.

## Solution

<img src="401/data_structures_algorithms/src/assets/left_join.jpg">
