# Multi-bracket Validation

## Feature Task:

Write a function that takes in a string as an argument. Return a boolean, true if brackets in the string are balanced: (),[], {}, false if they are not balanced. 

## Approach and Efficienty:

1. Use a stack and traverse the string.
2. if current character is an opening bracket: (, [, or {, push to stack. 
3. if current character is a closing bracket: ), ], or }, pop from stack.
4. if popped character matches pushed, return true, else return false. 

## Solution:

<img src="\assets/multi_bracket_validation.jpg">

Reference: <a href="https://stackoverflow.com/questions/23187539/java-balanced-expressions-check"> Stack Overflow</a>