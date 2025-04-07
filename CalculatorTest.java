import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @Test
    void testAddition() {
        double num1 = 10.5;
        double num2 = 5.5;
        double expected = 16.0;
        double result = num1 + num2;
        assertEquals(expected, result, "Addition test failed");
    }

    @Test
    void testSubtraction() {
        double num1 = 10.5;
        double num2 = 5.5;
        double expected = 5.0;
        double result = num1 - num2;
        assertEquals(expected, result, "Subtraction test failed");
    }

    @Test
    void testMultiplication() {
        double num1 = 10.0;
        double num2 = 5.0;
        double expected = 50.0;
        double result = num1 * num2;
        assertEquals(expected, result, "Multiplication test failed");
    }

    @Test
    void testDivision() {
        double num1 = 10.0;
        double num2 = 2.0;
        double expected = 5.0;
        double result = num1 / num2;
        assertEquals(expected, result, "Division test failed");
    }

    @Test
    void testDivisionByZero() {
        double num1 = 10.0;
        double num2 = 0.0;
        double result = num1 / num2;
        assertTrue(Double.isInfinite(result), "Division by zero test failed");
    }

    @Test
    void testModulus() {
        double num1 = 10.0;
        double num2 = 3.0;
        double expected = 1.0;
        double result = num1 % num2;
        assertEquals(expected, result, "Modulus test failed");
    }

    @Test
    void testPower() {
        double base = 2.0;
        double exponent = 3.0;
        double expected = 8.0;
        double result = Math.pow(base, exponent);
        assertEquals(expected, result, "Power test failed");
    }

    @Test
    void testSquareRoot() {
        double number = 16.0;
        double expected = 4.0;
        double result = Math.sqrt(number);
        assertEquals(expected, result, "Square root test failed");
    }

    @Test
    void testSquareRootOfNegativeNumber() {
        double number = -16.0;
        assertTrue(Double.isNaN(Math.sqrt(number)), "Square root of negative number test failed");
    }
}