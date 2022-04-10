public class FunctionalIntegral<T extends Function> {
    private final double aLim, bLim;

    public FunctionalIntegral(double aLim, double bLim) {
        this.aLim = aLim;
        this.bLim = bLim;
    }

    public double calculate(T func, double epsilon, double c) throws IllegalArgumentException {
        if (aLim < func.getA() || bLim > func.getB()) throw new IllegalArgumentException();
        double n = 2;
        double SL = 0;
        double S;
        double x;
        do {
            double h = (bLim - aLim) / n;
            x = aLim + (c * h);
            S = 0;
            for (int i = 0; i < n - 1; i++) {
                double F = func.getValue(x);
                S = S + F;
                x = x + h;
            }
            S = S * h;
            if (!(Math.abs(S - SL) <= epsilon)) {
                SL = S;
                n = 2 * n;
            } else {
                break;
            }
        } while (Math.abs(S - SL) <= epsilon);
        return S;
    }
}

