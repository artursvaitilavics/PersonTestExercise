import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

import sda.calculator.Calculator;
import org.junit.*;

public class TestCalculatorMock {

    @Test
    public void testMockedCalculator() {
        Calculator calc = mock(Calculator.class);
        when(calc.add(eq(1), eq(3))).thenReturn(123);
        when(calc.add(eq(1), eq(4))).thenReturn(5);

        when(calc.add(anyInt(), anyInt())).thenReturn(55);

        assert calc.add(1, 3) == 123;
        assertEquals(5, calc.add(1, 4));

        assertEquals(55, calc.add(1, 4));

        verify(calc, times(3)).add(anyInt(),anyInt());
    }
}
