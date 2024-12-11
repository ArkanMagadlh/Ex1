# Ex1: Number Formatting Converter and Calculator

This project is a Java program designed to validate, convert, and perform arithmetic operations on numbers represented as strings in bases ranging from 2 to 16. The project combines string manipulation, numerical computations, and base conversions in an interactive and user-friendly format.

---

## **Features**
1. **Validation**:
   - Checks if a string matches the format `<number>b<base>`.
   - Examples:
     -  `1001b2` (binary, decimal value: 9)
     -  `12b5` (base 5, decimal value: 7)
     -  `GbG` (invalid)

2. **Arithmetic Operations**:
   - Addition and multiplication of two numbers in the specified format.

3. **Base Conversion**:
   - Converts the results to any base from 2 (binary) to 16 (hexadecimal).

4. **Maximum Finder**:
   - Finds the largest value among the input numbers and results.

5. **Interactive Console Application**:
   - Prompts users for input and gives real-time results in the specified base.

---

## **How to Use It**
1. **Run the Program**:
   - Start the application and follow the prompts.
   - Example:

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
