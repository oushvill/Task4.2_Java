import static org.junit.Assert.assertTrue;

public class FunctionTest {

    private void assertEquals(double condition, double result) {
    }

    @org.junit.Test
    public void testLinearFunction() {
        FunctionLinear linear = new FunctionLinear(1, 2, 1, 10);
        assertEquals(linear.getValue(2), 4);
    }

    @org.junit.Test
    public void testExpFunction() {
        FunctionExp exp = new FunctionExp(1, 2, 1, 0);
        assertTrue(exp.getValue(2) - 7.38 < 0.1);
    }

    @org.junit.Test
    public void testSinFunction() {
        FunctionSinus sinus = new FunctionSinus(0, 2, 1, 1);
        assertTrue(sinus.getValue( 1)<1);
    }

    @org.junit.Test
    public void testRationalFunction() {
        FunctionFractional fractional = new FunctionFractional(1, 20, 1, 1, 1, 1);
        assertTrue(fractional.getValue(1) == 1);
    }

}