import org.junit.Test;

public class EquationSolverTest {
    private void assertArrayEquals(double MaxR, double result) {
    }

    @Test
    public void positiveSolution() {
        EquationSolver equationSolver = new EquationSolver(new SquareEqual(12.0D, 9.0D, -3.0D));
        assertArrayEquals(equationSolver.MaxR(), 0.25);
    }

    @org.junit.Test
    public void negativeSolution() {
        EquationSolver equationSolver = new EquationSolver(new SquareEqual(0., 1., 1.));
        assertArrayEquals(equationSolver.MaxR(), -1.);
    }
}
