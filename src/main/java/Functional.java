public interface Functional<T extends Function> {
    double calculate(T func);
    double result(T func);
}
