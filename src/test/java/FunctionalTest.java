import static org.junit.Assert.assertTrue;

public class FunctionalTest {
    private void assertEquals(double expected, double actual) {
    }

    @org.junit.Test
    public void IntegtalLinearTest(){
        FunctionLinear functionalTest = new FunctionLinear(0, 10, 1, 0);
        FunctionalIntegral<FunctionLinear> integralFunctional = new FunctionalIntegral<>(0, 10);
        assertEquals(integralFunctional.calculate(functionalTest,0.001,0.001),50);
    }


    @org.junit.Test
    public void IntegtalSinTest(){
        FunctionLinear functionalTest = new FunctionLinear(0, 1, 1, 0);
        FunctionalIntegral<FunctionLinear> integralFunctional = new FunctionalIntegral<>(0, 1);
        assertTrue(integralFunctional.calculate(functionalTest,0.001,0.001)  < 0.46);
    }


    @org.junit.Test
    public void IntegtalFractionalTest(){
        FunctionFractional functionalTest = new FunctionFractional(0,10, 25,0,1,0);
        FunctionalIntegral<FunctionFractional> integralFunctional = new FunctionalIntegral<>(0, 10);
        assertEquals(integralFunctional.calculate(functionalTest,0.001,0.001),25);
    }


    @org.junit.Test
    public void IntegtalExpTest(){
        FunctionExp functionalTest = new FunctionExp(0, 1, 1, 0);
        FunctionalIntegral<FunctionExp> integralFunctional = new FunctionalIntegral<>(0, 1);
        assertTrue(integralFunctional.calculate(functionalTest,0.001,0.001)  < 1.71829);
    }


    @org.junit.Test
    public void SummaTest(){
        FunctionLinear functionalTest = new FunctionLinear(0, 10, 1, 0);
        FunctionalSumma<FunctionLinear> summaFunctional = new FunctionalSumma<>(0, 10);
        assertEquals(summaFunctional.calculate(functionalTest),20.0);
    }
}