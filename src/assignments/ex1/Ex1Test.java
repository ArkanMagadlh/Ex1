package assignments.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This JUnit class represents a complete test class for Ex1.
 */
public class Ex1Test {

    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v, 2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v, v2);
        assertTrue(Ex1.equals(s10, s2));
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (String num : good) {
            assertTrue(Ex1.isNumber(num));
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (String num : not_good) {
            assertFalse(Ex1.isNumber(num));
        }
    }

    @Test
    void int2NumberTest() {
        assertEquals("5", Ex1.int2Number(5, 10));  // Expected output: "5" (no 'bA' suffix)
        assertEquals("101b2", Ex1.int2Number(5, 2));  // Expected output: "101b2"
        assertEquals("FFbG", Ex1.int2Number(255, 16));  // Expected output: "FFbG"
        assertEquals("", Ex1.int2Number(-1, 10)); // Invalid input
        assertEquals("", Ex1.int2Number(10, 20)); // Invalid base
    }


    @Test
    void maxIndexTest() {
        String[] arr = {"1011b2", "1100b2", "100b10"};
        assertEquals(2, Ex1.maxIndex(arr)); // "100b10" is the largest (100 in decimal)

        String[] arr2 = {"FFbG", "100b10", "111b2"};
        assertEquals(1, Ex1.maxIndex(arr2)); // "100b10" is the largest (256 in decimal)
    }


    @Test
    void additionalTests() {
        assertFalse(Ex1.isNumber(null)); // Null input
        assertFalse(Ex1.isNumber("")); // Empty string
        assertEquals(-1, Ex1.number2Int("G123b16")); // Invalid format
        assertTrue(Ex1.equals("1011b2", "11bA")); // Same value, different formats
        assertFalse(Ex1.equals("1011b2", "111b2")); // Different values
    }
}
