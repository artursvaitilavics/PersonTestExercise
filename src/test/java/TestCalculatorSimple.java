import org.junit.*;
import org.junit.rules.ExpectedException;
import sda.calculator.Calculator;

import static org.junit.Assert.*;

public class TestCalculatorSimple {
    static Calculator calculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void createCalculator(){
        calculator = new Calculator(); // creates calc onbjekt when before this class, so dont need to create
        //in every merthod
        System.out.println("Start");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
        //Could clean, like disconnect from DB and stuff like that
    }

    @Before
    public void createCalc(){
        System.out.println("Before each Test.");
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
        assertEquals(4, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
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
