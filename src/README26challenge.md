# Lecture Notes: Insertion Sort

An insertion sort creates an array that is sorted one item at a time in increasing order, like rearranging a hand of playing cards. 
It is efficient for small data sets. It uses nested loops so the Big O is O(n^2).

## Learning Objectives

1. Return and accept an integer array, iterate through the length of the array.
2. The outer for loop (i) starts at index 1 because index 0 is already sorted(there is no value to left).
3. The key is initialized to array[i]
4. The inner loop (j) counts down from i-1. 
5. Use while loop to iterate through array of items and swap values. 

## Lecture Flow

1. Start with problem domain.
2. Draw visual examples and walk through swapping. 
3. Write out algorithm.
5. Write out code. 
5. Step through with examples.

## Diagram

<img src="assets/insertion_sort.jpg">

## Algorithm

1. Start at index 0 and compare each item to the value to its left. 
2. If value < left value, swap items. 
3. If value > left value, keep in place and compare value to right.
4. Keep comparing and swapping until sorting is complete. 

## Pseudocode

(Provided in Code Challenge Assignment)

InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

## Readings and References

Watch: <a href="https://www.youtube.com/watch?v=lCDZ0IprFw4">Joe James Insertion Sort Algorithm</a>

Read: <a href="https://en.wikipedia.org/wiki/Insertion_sort">Insertion Sort: Wikipedia</a>
<a href="https://www.geeksforgeeks.org/insertion-sort/">Insertion Sort: Geeks for Geeks</a>

Bookmark: <a href="https://canvas.instructure.com/courses/1576285/assignments/11066194">Code Challenge 26</a>

