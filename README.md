# Ex1: Number Formatting Converter and Calculator

## Overview
This project focuses on creating a Java-based program to validate, convert, and perform arithmetic operations on numbers represented as strings in bases ranging from 2 to 16. The project uses functional programming principles, thorough testing, and GitHub for version control. 

## Features
1. **String-Based Number Representation**:
   - Numbers are represented as strings in the format `<number>b<base>`. 
     Examples: 
     - `1001b2` (binary: 9 in decimal)
     - `135bA` (decimal: 135)
     - `12b5` (base 5: 7 in decimal)
   - Supports bases from **2** (binary) to **16** (hexadecimal).

2. **Validation**:
   - Determines if a given string is a valid number representation based on the specified format and base.
   - Examples of valid inputs: `100111b2`, `135bA`.
   - Examples of invalid inputs: `b2`, `123b`, `0b1`, `-3b5`, `GbG`.

3. **Arithmetic Operations**:
   - **Addition**: Calculates the sum of two valid numbers.
   - **Multiplication**: Calculates the product of two valid numbers.

4. **Base Conversion**:
   - Converts the result of operations or numbers to a user-specified base (2–16).

5. **Maximum Finder**:
   - Determines the maximum value among a set of numbers (including intermediate results).

6. **Interactive Console Application**:
   - Prompts users to input numbers, perform operations, and output results in a specified base.

7. **JUnit Testing**:
   - Comprehensive tests to verify correctness of validation, arithmetic, and conversion functions.

---

## How It Works

### Input Format
- The program expects numbers as strings in the format `<number>b<base>`.
- Bases:
  - `b2` for binary, `b10` for decimal, `b16` for hexadecimal, etc.
  - Bases 10-16 are represented using characters `A`, `B`, ..., `G`.

### Example Interaction
1. User inputs a string number (`num1`).
2. The program validates if it is properly formatted and converts it to decimal.
3. User inputs a second number (`num2`), which is similarly validated.
4. User specifies the desired output base for results.
5. The program performs:
   - Addition and multiplication of `num1` and `num2`.
   - Base conversion for the results.
   - Finds the maximum value among the numbers and results.

### Example Execution

Enter a string as number#1 (or "quit" to end the program): 
1001b2
num1= 1001b2 is number: true, value: 9

Enter a string as number#2 (or "quit" to end the program): 
11b3
num2= 11b3 is number: true, value: 4

Enter a base for output: (a number [2,16]) 
10
1001b2 + 11b3 = 13
1001b2 * 11b3 = 36
Max number over [1001b2, 11b3, 13, 36] is: 36
