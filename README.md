# Ex1: Number Formatting Converter and Calculator

This project is about creating a program in Java to validate, convert, and perform arithmetic operations on numbers written as strings in bases from 2 to 16. It's a mix of string manipulation, arithmetic, and base conversions, all done interactively. 

## What It Does
1. **Validates Strings**:
   - Checks if a string is a number in the form `<number>b<base>`. Examples:
     - `1001b2` is valid (binary, decimal value 9).
     - `12b5` is valid (base 5, decimal value 7).
     - `GbG` is invalid.

2. **Performs Arithmetic**:
   - Adds and multiplies two numbers provided in the valid format.

3. **Converts Between Bases**:
   - Results can be shown in any base from 2 (binary) to 16 (hexadecimal).

4. **Finds the Maximum**:
   - Figures out the largest number among inputs and results.

5. **Interactive Console App**:
   - Asks for inputs step-by-step and gives clear outputs.

---

## How to Use It
Run the program and follow the prompts. Here's an example:

```plaintext
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
