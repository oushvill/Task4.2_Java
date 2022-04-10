import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1.1
        SquareEqual squareEqual = new SquareEqual(12., 9., -3.);
        System.out.println("Массив корней квадратного трёхчлена: "+Arrays.toString(squareEqual.solution()));

        // 1.2
        EquationSolver equationSolver = new EquationSolver(new SquareEqual(12.0D, 9.0D, -3.0D));
        System.out.println("Мах корень = "+equationSolver.MaxR());

        System.out.println();

        // 2.2 f=Ax+B
        FunctionLinear linearFunction= new FunctionLinear(0,10,2,4);
        System.out.println("Ф-ция вида f(x)=A*x + B == "+linearFunction.getValue(5));

        // 2.2 f=A*sin(Bx)
        FunctionSinus sinFunction = new FunctionSinus(0, 10, 2, 4);
        System.out.println("Ф-ция вида f(x)=A * sin(Bx) == "+sinFunction.getValue(5));

        // 2.2 f=(Ax + B) / (Cx + D)
        FunctionFractional fractionalFunction= new FunctionFractional(0,10, 2,4,6,8);
        System.out.println("Ф-ция вида f(x)=(Ax + B) / (Cx + D) == "+fractionalFunction.getValue(5));

        // 2.2 f=A*exp(x)+B
        FunctionExp expFunction = new FunctionExp(0, 10, 2, 4);
        System.out.println("Ф-ция вида f(x)=A * exp(x)+B == "+expFunction.getValue(5));

        System.out.println();

        // 2.4
        FunctionLinear functional = new FunctionLinear(0, 10, 1, 100);

        FunctionalIntegral<FunctionLinear> integralFunctional = new FunctionalIntegral<>(0, 10);
        System.out.println("Функциональный интеграл: "+Math.ceil(integralFunctional.calculate(functional,0.001,0.001)));

        FunctionalSumma<FunctionLinear> summaFunctional = new FunctionalSumma<>(10, 0);
        System.out.println("Функциональная сумма: "+summaFunctional.calculate(functional));
    }
}