# Fibonacci-in-Java

## Overview
This Java program calculates and displays the Fibonacci series up to a specified number. The program offers three different ways to input the number: through command line arguments, using the Scanner class, or through the System.Console class.

## Fibonacci.java

### `main` Method
- Entry point of the program.
- Handles user input and calls the `fibonacci` method to generate and print the Fibonacci series.

### `fibonacci` Method
- Recursive method to calculate the Fibonacci sequence.
- Takes an integer `n` as input and returns the nth Fibonacci number.
- Base case: If `n` is 0 or 1, returns `n`.
- Recursive case: Returns the sum of the (n-1)th and (n-2)th Fibonacci numbers.
