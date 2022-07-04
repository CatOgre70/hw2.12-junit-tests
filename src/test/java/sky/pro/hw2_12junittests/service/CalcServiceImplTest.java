package sky.pro.hw2_12junittests.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcServiceImplTest {

    private int num1_1, num1_2, num2_1, num2_2;
    final int numZero = 0;
    CalcService calsService = new CalcServiceImpl();

    @BeforeEach
    public void testInitialization(){
        num1_1 = 5;
        num1_2 = 7;
        num2_1 = 47;
        num2_2 = -3;
    }


    @Test
    public void testGetPlus(){
        String expected = num1_1 + " + " + num2_1 + " = " + (num1_1 + num2_1);
        String result = this.calsService.getPlus(num1_1, num2_1);

        assertEquals(result, expected);

        expected = num1_2 + " + " + num2_2 + " = " + (num1_2 + num2_2);
        result = this.calsService.getPlus(num1_2, num2_2);

        assertEquals(result, expected);
    }

    @Test
    public void testGetMinus(){
        String expected = num1_1 + " - " + num2_1 + " = " + (num1_1 - num2_1);
        String result = this.calsService.getMinus(num1_1, num2_1);

        assertEquals(result, expected);

        expected = num1_2 + " - " + num2_2 + " = " + (num1_2 - num2_2);
        result = this.calsService.getMinus(num1_2, num2_2);

        assertEquals(result, expected);
    }

    @Test
    public void testGetMultiply(){
        String expected = num1_1 + " * " + num2_1 + " = " + (num1_1 * num2_1);
        String result = this.calsService.getMultiply(num1_1, num2_1);

        assertEquals(result, expected);

        expected = num1_2 + " * " + num2_2 + " = " + (num1_2 * num2_2);
        result = this.calsService.getMultiply(num1_2, num2_2);

        assertEquals(result, expected);
    }

    @Test
    public void testGetDivide(){
        String expected = num1_1 + " / " + num2_1 + " = " + ((double) num1_1 / num2_1);
        String result = this.calsService.getDivide(num1_1, num2_1);

        assertEquals(result, expected);

        expected = num1_2 + " / " + num2_2 + " = " + ((double) num1_2 / num2_2);
        result = this.calsService.getDivide(num1_2, num2_2);

        assertEquals(result, expected);
    }

    @Test
    public void testGetDivideByZero(){
        assertThrows(IllegalArgumentException.class, () -> this.calsService.getDivide(num2_1, numZero));
    }

}
