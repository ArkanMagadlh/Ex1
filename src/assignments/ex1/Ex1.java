
package assignments.ex1;
/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 */
public class Ex1 {

    public static int number2Int(String num) {
        if (num == null || num.isEmpty() || !isNumber(num)) return -1;
        if (!num.contains("b")) return Integer.parseInt(num); // Default base 10

        String[] parts = num.split("b");
        String numberPart = parts[0];
        int base = parts[1].equals("G") ? 16 : Integer.parseInt(parts[1], 16);

        try {
            return Integer.parseInt(numberPart, base);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static boolean isNumber(String a) {
        if (a == null || a.isEmpty() || a.contains(" ")) return false;
        if (!a.contains("b")) return a.matches("\\d+"); // Default base 10 numbers

        String[] parts = a.split("b");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) return false;
        int base;
        try {
            base = parts[1].equals("G") ? 16 : Integer.parseInt(parts[1], 16);
        } catch (NumberFormatException e) {
            return false;
        }
        if (base < 2 || base > 16) return false;

        return parts[0].matches("[0-9A-F]+") && isValidForBase(parts[0], base);
    }

    private static boolean isValidForBase(String numberPart, int base) {
        for (char c : numberPart.toCharArray()) {
            int digit = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            if (digit >= base) return false;
        }
        return true;
    }

    public static String int2Number(int num, int base) {
        if (num < 0 || base < 2 || base > 16) return "";  // Invalid input

        // For base 10, return the number as is, without 'bA'
        if (base == 10) {
            return Integer.toString(num);  // No 'bA' suffix for base 10
        } else {
            // For other bases (2 to 16), format with the base suffix
            String baseSuffix = base == 16 ? "G" : Integer.toString(base, 16).toUpperCase();
            return Integer.toString(num, base).toUpperCase() + "b" + baseSuffix;
        }
    }


    public static boolean equals(String n1, String n2) {
        if (!isNumber(n1) || !isNumber(n2)) return false;
        return number2Int(n1) == number2Int(n2);
    }
    public static int maxIndex(String[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int maxIndex = 0;
        int maxValue = number2Int(arr[0]);  // Convert first element to decimal
        for (int i = 1; i < arr.length; i++) {  // Start from second element
            int value = number2Int(arr[i]);
            if (value > maxValue) {  // If the current value is larger
                maxValue = value;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
