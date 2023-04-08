import org.slavadef.com.ua.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CalculatorTests {
    private SumCalculator calculator;
    @BeforeEach
    public void beforeEach() {
        calculator  = new SumCalculator();
    }
    @Test
    public void testSumCalculatorWithOne() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSumCalculatorWithThree() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSumCalculatorWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
