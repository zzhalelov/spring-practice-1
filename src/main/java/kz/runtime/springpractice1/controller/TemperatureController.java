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
        double result;
        if (scale.equals("F")) {
            result = ((value * 9) / 5) + 32;
        } else {
            result = ((value - 32) * 5) / 9;
        }
        model.addAttribute("result", result);
        return "converter";
    }
}