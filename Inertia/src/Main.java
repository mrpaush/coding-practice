import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// I want you to test me on coding from low difficulty to high difficulty. Please do not auto complete the code copilot. I want to write the code myself. This applies to all the problems.
// I cannot progress from one difficulty to the next until I have solved all the problems in the current difficulty.
//NOTE FOR COPILOT AND ANY OTHER AI: Please only provide the structure or "mask" of the code. I will fill in the implementation details myself. Do not auto-complete the solution.

//Easy:
// Output and Calculations
//Problem 1: Write a program that prints 'Hello, World!' to the console.
//Problem 2: Write a program that prints your name and age.
//Problem 3: Write a program to calculate the area of a circle given its radius.
//Problem 4: Write a program to convert temperature from Celsius to Fahrenheit (or vice versa).
// Conditionals
//Problem 5: FizzBuzz Sum: Calculate the sum of 1 to 100, replacing multiples of 3 with "Fizz", multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
//Problem 6: Write a program to determine if a given number is even or odd.
//Problem 7:  Write a program to find the largest of three numbers.
// Loops
//Problem 8: Write a program to print numbers from 1 to 100 (or a different range).
//Problem 9:  Write a program to calculate the factorial of a number.
//Problem 10: Write a program to generate the first 15 numbers of the Fibonacci Sequence.
// Arrays and Input
//Problem 11: Calculate Area and Circumference: Write a program that takes a radius as input and calculates both the area and circumference of the circle.
//Problem 12: List Addition:  Write a program that takes two lists of numbers and creates a new list containing the sum of corresponding elements from the input lists.
//Problem 13: Element Removal  Write a program that takes a list of numbers and a target value, and removes all occurrences of the target value from the list.
//Problem 14: Take User Input: Write a program that takes a name as input and prints "Hello, [name]!".
//Problem 15: Write a program to find the maximum (or minimum) value in an array.
//Problem 16: Write a program to calculate the average of the numbers in an array.


//Medium:
// String Manipulation
//Problem 1: Write a program that reverses a string without using any built-in reverse methods.
//Problem 2: Write a program that checks if a string is a palindrome.
//Problem 3: Write a program that finds the longest substring without repeating characters.
//Problem 4: Write a program to implement a basic text editor function (e.g., find and replace, text insertion/deletion).
// Array Manipulation
//Problem 5: Write a program to implement a more advanced sorting algorithm (Merge Sort, Quick Sort, or Heap Sort).
//Problem 6: Write a program to search for an element in a sorted array (Binary Search).
// Data Structures
//Problem 7: Write a program that implements a basic stack with push, pop, and peek methods.
//Problem 8: Write a program that implements a basic queue with enqueue, dequeue, and peek methods.
//Problem 9: (If trees are introduced):  Write a program for basic tree traversal (e.g., pre-order, in-order, post-order) on a simple binary tree.
// Recursion
//Problem 10: Write a program that calculates the nth Fibonacci number using recursion.
//Problem 11:  Write a recursive function to solve a problem like the Tower of Hanoi.


//Hard:
// Dynamic Programming
//Problem 1:  Write a program that finds the longest increasing subsequence in an array.
//Problem 2: Write a program that finds the maximum sum of a subarray with at least k elements.
//Problem 3: Write a program that finds the number of ways to decode a message, given 'A' = '1', 'B'='2', etc.
//Problem 4: Write a program to solve a classic dynamic programming problem (e.g., Coin Change, Knapsack Problem).
// Graph Algorithms
//Problem 5: Write a program that finds the shortest path in a grid from a start to an end, considering blocked cells. Introduce a heuristic (e.g., Manhattan distance) for efficiency.
//Problem 6: Write a program that finds the minimum spanning tree of a graph (Kruskal's or Prim's algorithm).
// Trees
//Problem 7: Write a program that checks if a binary tree is a valid Binary Search Tree (BST).
//Problem 8: Write a program to find the lowest common ancestor of two nodes in a BST (or a general tree).
//Problem 9: Write a program to implement BST insertion and deletion.
// Advanced Concepts
//Problem 10: Write a program that finds the longest common subsequence of two (or three) strings.
//Problem 11: (Optional - Backtracking): Write a program to solve a problem that requires backtracking (e.g., Sudoku Solver, N-Queens problem).


//Very Hard:
// Dynamic Programming
//Problem 1:  Write a program to find the maximum product of an increasing subsequence of size 3.
//Problem 2: Write a program that finds the maximum sum of a submatrix in a 2D array.
//Problem 3: Write a program to solve a complex dynamic programming problem with intricate state definition (e.g.,  Edit Distance, Optimal Matrix Chain Multiplication)
// Graph Algorithms
//Problem 4: Write a program that finds the shortest path in a weighted graph using Dijkstra's algorithm.
//Problem 5: Implement a graph algorithm to solve a more complex optimization problem (e.g.,  Traveling Salesman Problem approximation, Network Flow).
// Complex String / Pattern Matching
//Problem 6:  Implement a regular expression matching engine with support for advanced pattern features.
//Problem 7:  Write a program for text segmentation or tokenization with complex rules.
// Optimization
//Problem 8:  Write a program to find the Kth largest (or smallest) element in an unsorted array efficiently (e.g., using Median of Medians algorithm) .
//Problem 9:  Implement an efficient algorithm to find the longest palindromic substring. (Consider Manacher's algorithm)
// Advanced Data Structures (Conceptual)
//Problem 10: Design a data structure tailored to a specific problem where common structures are inefficient. Explain the reasoning and operations.


//Expert:
// Dynamic Programming Mastery
//Problem 1:  Solve a dynamic programming problem with a large state space or complex constraints. Optimize for both time and space complexity.
//Problem 2:  Design a dynamic programming solution for a problem where the optimal substructure is not immediately obvious.
// Graph Algorithms and Applications
//Problem 3: Implement a graph algorithm to solve a real-world optimization scenario (e.g., logistics routing, resource scheduling).
//Problem 4: Modify or adapt a known graph algorithm to fit a problem with unusual  constraints or requirements.
// Algorithm Design and Adaptation
//Problem 5: Design an efficient algorithm for a problem that doesn't seem to fit standard techniques. Justify your design choices.
//Problem 6:  Analyze the time and space complexity of several possible approaches to a problem. Choose the best one given performance requirements and potential input characteristics.
// Optimization
//Problem 7: Optimize the performance of a computationally expensive solution (may involve algorithm tweaks, data structure choices, or even some awareness of system-level caching)
// Ambiguity and Open-endedness
//Problem 8:  Design a solution for a problem where the input format or success criteria are loosely defined, requiring clarification and assumptions.
//Problem 9:  Evaluate different algorithms or approaches for a problem where  the "best" solution depends on tradeoffs and real-world usage patterns.
//Problem 10: Implement a simple machine learning model or a statistical analysis method to solve a problem (focus on algorithm and reasoning).


//Master:
// Dynamic Programming Mastery
//Problem 1:  Find the maximum sum of a subarray with adjacency constraints (2, 3, or more), introducing flexibility in constraints.
//Problem 2: Find the maximum sum of a subarray with advanced constraints (e.g., length range, number of distinct elements, etc.)
// Graph Algorithms
//Problem 3: Implement cycle detection in a graph (DFS or Union-Find based).
// Problem 4: Implement an advanced graph algorithm and apply it to solve a complex optimization problem  (e.g., strongly connected components, min-cut/max-flow).
// Complex String Manipulation
//Problem 5: Write a program to find the longest substring with all distinct characters.
//Problem 6: Implement advanced text transformation based on complex patterns, regular expressions, or parsing rules.
// Algorithm Design and Real-World Focus
//Problem 7: Design an efficient algorithm for a problem that doesn't fit standard techniques. Provide a clear explanation and justification of your design.
//Problem 8: Solve a complex problem from a past ACM ICPC contest (provide a link or description).
//Problem 9: Solve a complex problem from a past Google Code Jam contest (provide a link or description).
//Problem 10: Count the Number of Islands in a Grid with Unique Shapes (as previously discussed).
