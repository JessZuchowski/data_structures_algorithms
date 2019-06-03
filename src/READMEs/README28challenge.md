# Lecture Notes: Quick Sort

## Learning Objectives

Quick Sort is a comparison sort and is faster than other sorts when implemented efficiently. It operates on arrays in-place by partitioning around a pivot point recursively.

## Lecture Flow

1. Start with problem domain.
2. Draw visual examples and walk through sort.
3. Write out algorithm.
4. Write out code.
5. Step through with examples.

## Diagram

## Algorithm

1. Take in the last element of an array as a pivot.
2. Place the element in the sorted array.
3. Place all smaller elements to the left of the pivot and all greater elements to the right.


## Pseudocode

quickSort(arr[], low, high) {
if (low < high) {
partition = partitionIndex(arr, low, high);

quickSort(arr, low, partition - 1);
quickSort(arr, partition + 1, high);
}
}

## Readings and References

Watch: <a href="https://www.youtube.com/watch?v=Fiot5yuwPAg">Joe James Java: QuickSort Explained</a>

Read: <a href="https://en.wikipedia.org/wiki/Quicksort">Quicksort Wikipedia</a>
<br>
<a href="">QuickSort Geeks for Geeks</a>


