package kz.runtime.springpractice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @GetMapping("/calc")
    public String calculate(
            @RequestParam(required = false) Double value1,
            @RequestParam(required = false) Double value2,
            @RequestParam(defaultValue = "null") String operator,
            Model model
    ) {
        double resultInt;
        String result;
        switch (operator) {
            case "+":
                resultInt = value1 + value2;
                result = String.format("%.2f", resultInt);
                break;
            case "-":
                resultInt = value1 - value2;
                result = String.format("%.2f", resultInt);
                break;
            case "*":
                resultInt = value1 * value2;
                result = String.format("%.2f", resultInt);
                break;
            case "/":
                if (value2 == 0) {
                    result = "Ошибка! На ноль делить нельзя!!!";
                } else {
                    resultInt = value1 / value2;
                    result = String.format("%.2f", resultInt);
                }
                break;
            default:
                return "calc";
        }
        model.addAttribute("result", result);
        return "/calc";
    }
}