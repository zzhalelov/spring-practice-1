package kz.runtime.springpractice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemperatureController {
    @GetMapping("/converter")
    public String get() {
        return "converter";
    }

    @PostMapping("/converter")
    public String convert(@RequestParam("value") double value, @RequestParam("scale") String scale, Model model) {
        double output;
        String result;
        if (scale.equals("F")) {
            output = ((value * 9) / 5) + 32;
            result = String.format("%.2f", output);
//            model.addAttribute("result", value + " градусов Цельсия это " + result + " градусов Фаренгейта");
        } else {
            output = ((value - 32) * 5) / 9;
            result = String.format("%.2f", output);
//            model.addAttribute("result", value + " градусов Фаренгейта это " + result + " градусов Цельсия");
        }
        model.addAttribute("result", result);
        return "converter";
    }
}