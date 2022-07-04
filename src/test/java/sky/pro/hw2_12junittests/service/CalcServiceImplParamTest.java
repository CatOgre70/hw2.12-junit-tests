package sky.pro.hw2_12junittests.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sky.pro.hw2_12junittests.service.Constants.*;

public class CalcServiceImplParamTest {

    private final CalcService calcService = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalcParams")
    public void testGetSum(int a, int b){
        String result = calcService.getPlus(a, b);
        assertEquals(a + " + " + b + " = " + (a + b), result);
    }

    @ParameterizedTest
    @MethodSource("provideCalcParams")
    public void testGetMinus(int a, int b){
        String result = calcService.getMinus(a, b);
        assertEquals(a + " - " + b + " = " + (a - b), result);
    }

    @ParameterizedTest
    @MethodSource("provideCalcParams")
    public void testGetMultiply(int a, int b){
        String result = calcService.getMultiply(a, b);
        assertEquals(a + " * " + b + " = " + (a * b), result);
    }

    @ParameterizedTest
    @MethodSource("provideCalcParams")
    public void testGetDivide(int a, int b){
        String result = calcService.getDivide(a, b);
        assertEquals(a + " / " + b + " = " + ((double)a / b), result);
    }

    private static Stream<Arguments> provideCalcParams(){
        return Stream.of(
                Arguments.of(FIVE, SEVEN),
                Arguments.of(FORTY, EIGHT),
                Arguments.of(FORTY, FIVE),
                Arguments.of(ZERO, FIVE)
        );
    }

}
