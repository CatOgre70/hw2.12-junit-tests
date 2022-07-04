package sky.pro.hw2_12junittests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.hw2_12junittests.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }

    @GetMapping()
    public String showCalcInstruction(){
        return "<h2>Добро пожаловать в калькулятор! Использование:</h2>" +
                "<p>/plus?num1=x&num2=y - выдаст сумму x и y</p>" +
                "<p>/minus?num1=x&num2=y - выдаст разницу x и y</p>" +
                "<p>/multiply?num1=x&num2=y - выдаст произведение x и y</p>" +
                "<p>/divide?num1=x&num2=y - выдаст результат деления x на y</p>";
    }

    @GetMapping("/plus")
    public String showPlus(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2){

        return calcService.getPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String showMinus(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2){
        return calcService.getMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiply(@RequestParam("num1") int num1,
                               @RequestParam("num2") int num2){
        return calcService.getMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivide(@RequestParam("num1") int num1,
                             @RequestParam("num2") int num2){
        return calcService.getDivide(num1, num2);
    }


}
