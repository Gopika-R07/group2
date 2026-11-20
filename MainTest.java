
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    // EXPERIMENT 5: CALCULATOR TESTS

    @Test
    public void testAddition() {
        assertEquals(15, Main.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, Main.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, Main.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, Main.divide(10, 5), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Main.divide(10, 0);
    }


    // EXPERIMENT 6: PASS OR FAIL TESTS

    @Test
    public void testMarks35() {
        assertFalse(Main.isPassed(35));
    }

    @Test
    public void testMarks50() {
        assertTrue(Main.isPassed(50));
    }

    @Test
    public void testMarks75() {
        assertTrue(Main.isPassed(75));
    }

    @Test
    public void testMarks100() {
        assertTrue(Main.isPassed(100));
    }


    // EXPERIMENT 7: LEAP YEAR TESTS

    @Test
    public void testLeapYear() {
        assertTrue(Main.isLeapYear(2024));
    }

    @Test
    public void testNonLeapYear() {
        assertFalse(Main.isLeapYear(2023));
    }

    @Test
    public void testCenturyNonLeapYear() {
        assertFalse(Main.isLeapYear(1900));
    }

    @Test
    public void testCenturyLeapYear() {
        assertTrue(Main.isLeapYear(2000));
    }


    // EXPERIMENT 8: DISCOUNT TESTS

    @Test
    public void testBelow1000() {
        assertEquals(900.0,
                Main.calculateFinalAmount(900), 0.001);
    }

    @Test
    public void testEqualTo1000() {
        assertEquals(900.0,
                Main.calculateFinalAmount(1000), 0.001);
    }

    @Test
    public void testAbove1000() {
        assertEquals(1350.0,
                Main.calculateFinalAmount(1500), 0.001);
    }
}
