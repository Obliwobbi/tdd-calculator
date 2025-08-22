package dk.obli.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
         calculator = new Calculator();
    }

    @Test
    @DisplayName("Test of adding")
    void addTest(){
        int actual = calculator.add(2,4);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test of subtracting")
    void subtractTest(){
        int actual = calculator.subtract(4,2);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test of multiplying")
    void multiplyTest(){
        int actual = calculator.multiply(4,7);
        int expected = 28;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test of dividing")
    void divideTest(){
        int actual = calculator.divide(8,4);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test of add with string input")
    void addStringInputTest(){
        int actual = calculator.add("1,2,3");
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test of add with int array")
    void addIntArrayTest(){
        int actual = calculator.add(new int[]{1,2,3});
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test of add with more ints")
    void addMultipleIntTest(){
        int actual = calculator.add(1,2,3,4,5);
        int expected = 15;
        assertEquals(expected,actual);
    }

}