import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import sda.calculator.Calculator;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCalculatorMultParams {
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][]{
                {1, 1, 1, 2},
                {2, 4, 8, 6},
                {1, 6, 6, 7},
                {2, 6, 12, 8},
                {4, 1, 4, 5}
        });
    }

    @Parameterized.Parameter(0)
    public int arg1;
    @Parameterized.Parameter(1)
    public int arg2;
    @Parameterized.Parameter(2)
    public int resMul;
    @Parameterized.Parameter(3)
    public int resAdd;

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(resMul, calculator.multiply(arg1, arg2));
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(resAdd, calculator.add(arg1, arg2));
    }
}