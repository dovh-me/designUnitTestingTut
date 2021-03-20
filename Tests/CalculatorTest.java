import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int firstNumber = 10;

        int secondNumber = 20;

        int expectedOutput = 30;

        Calculator calculatorTest = new Calculator();
        int actualOutput = calculatorTest.add(firstNumber,secondNumber);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void multiply() {
        int firstNumber = 10;

        int secondNumber = 20;

        int expectedOutput = 200;

        Calculator calculatorTest = new Calculator();
        int actualOutput = calculatorTest.multiply(firstNumber,secondNumber);
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void division() {
        int firstNumber = 20;

        int secondNumber = 0;

        Calculator calculatorTest = new Calculator();

        assertThrows(ArithmeticException.class, ()->{
            calculatorTest.division(firstNumber, secondNumber);
        });
    }
}