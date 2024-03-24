package kz.runtime.springpractice1.controller;

import kz.runtime.springpractice1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {
    @GetMapping("/test")
    public String get(Model model) {
        model.addAttribute("key", "Hello");
        model.addAttribute("user", new User("Kendrick", 29));
        return "test";
    }
}