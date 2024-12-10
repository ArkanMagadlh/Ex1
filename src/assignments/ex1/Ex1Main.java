
package assignments.ex1;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";

        while (true) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or "+"quit"+" to end the program): ");
            num1 = sc.next();
            if (num1.equals(quit)) {
                System.out.println("quitting now...");
                break;
            }

            if (!Ex1.isNumber(num1)) {
                System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                continue;
            }

            int num1Val = Ex1.number2Int(num1);
            System.out.println("num1= " + num1 + " is number: true , value: " + num1Val);

            System.out.println("Enter a string as number#2 (or "+"quit"+" to end the program): ");
            num2 = sc.next();
            if (num2.equals(quit)) {
                System.out.println("quitting now...");
                break;
            }

            if (!Ex1.isNumber(num2)) {
                System.out.println("ERR: num2 is in the wrong format! (" + num2 + ")");
                continue;
            }

            int num2Val = Ex1.number2Int(num2);
            System.out.println("num2= " + num2 + " is number: true , value: " + num2Val);

            System.out.println("Enter a base for output: (a number [2,16]) ");
            int base = sc.nextInt();

            // Perform addition and multiplication
            int sum = num1Val + num2Val;
            int product = num1Val * num2Val;

            // Format results
            String sumFormatted = Ex1.int2Number(sum, base);
            String productFormatted = Ex1.int2Number(product, base);

            System.out.println(num1 + " + " + num2 + " = " + sumFormatted);
            System.out.println(num1 + " * " + num2 + " = " + productFormatted);

            // Find the maximum value
            String[] numbers = {num1, num2, sumFormatted, productFormatted};
            String maxNumber = numbers[Ex1.maxIndex(numbers)];

            System.out.println("Max number over [" + String.join(",", numbers) + "] is: " + maxNumber);
        }
    }
}
