package kz.runtime.springpractice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemperatureController {
    @GetMapping("/converter")
    public String converterForm() {
        return "converter";
    }

    @PostMapping("/converter")
    public String converterTemperature(@RequestParam double inputValue, Model model) {


        return "result";
    }
}