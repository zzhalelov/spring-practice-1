package kz.runtime.springpractice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class TimeController {
    @GetMapping("/time")
    public String getTime() {
        LocalTime localTime = LocalTime.now().minusHours(1);
        return localTime.toString();
    }
}