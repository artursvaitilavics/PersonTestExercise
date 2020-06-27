import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sda.calculator.Calculator;

import static org.junit.Assert.*;

public class TestCalculatorSimple {
    Calculator calculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void createCalc(){
        calculator = new Calculator();
    }

    @After
    public void afterTest(){
        System.out.println("After each test.");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 1);
        assertEquals(3, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(12, result);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(5, 2);
        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int result = calculator.divide(5, 0);
        assertEquals(0, result);
    }


    @Test
    public void testDivideByZeroWithRule() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");

        int result = calculator.divide(5, 0);
    }
}
