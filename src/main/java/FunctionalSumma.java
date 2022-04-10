public class FunctionalSumma<T extends Function>  {
    private final double aLim, bLim;


    public FunctionalSumma(double aLim, double bLim) {
        this.aLim = aLim;
        this.bLim = bLim;
    }


    public double calculate(T func) {
        if (aLim < func.getA() || bLim > func.getB()) throw new IllegalArgumentException("Переменная X не принадлежит отрезку [a, b] !");
        return func.getValue(func.getB()) +
                func.getValue(func.getA()) +
                func.getValue((func.getB() + func.getB()) / 2);
    }
}
