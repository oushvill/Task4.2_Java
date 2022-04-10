public class FunctionSinus implements Function {
    double A, B;
    double a, b;

    public FunctionSinus(double a, double b, double A, double B) {
        this.A = A;
        this.B = B;

        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x < a||x > b ) throw new IllegalArgumentException("Переменная X не принадлежит отрезку [a, b] !");

        return A * Math.sin(B * x);
    }

    @Override
    public double getA() {
        return a;
    }
    @Override
    public double getB() {
        return b;
    }
}
