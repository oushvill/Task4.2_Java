public class FunctionFractional implements Function {
    double A, B, D, C;
    double a, b;

    public FunctionFractional(double a, double b, double A, double B, double C, double D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;

        this.a = a;
        this.b = b;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x < a || x > b) throw new IllegalArgumentException("Переменная X не принадлежит отрезку [a, b] !");
        return (A * x + B) / (C * x + D);
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