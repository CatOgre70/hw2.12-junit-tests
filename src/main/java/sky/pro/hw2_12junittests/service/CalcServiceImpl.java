package sky.pro.hw2_12junittests.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public String getPlus(int num1, int num2){
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String getMinus(int num1, int num2){
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String getMultiply(int num1, int num2){
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String getDivide(int num1, int num2){
        if(num2 == 0)
            throw new IllegalArgumentException("Ой! Я поделила на ноль и улетаю в другую Вселенную! " +
                    "Прощай, человечество!");

        return num1 + " / " + num2 + " = " + ((double) num1 / num2);
    }
}
