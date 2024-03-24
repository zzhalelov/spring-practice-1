package kz.runtime.springpractice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    @GetMapping("/random")
    public String getRandomNumber() {
        int random = (int) (Math.random() * 100);
        return "Случайное число: " + random;
    }
}