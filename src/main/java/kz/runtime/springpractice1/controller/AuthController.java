package kz.runtime.springpractice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/auth")
    public String verifyAuth(String login, String password) {
        if (login.equals("admin") && password.equals("1234")) {
            return "Авторизация прошла успешно!";
        } else {
            return "Не верный логин или пароль!";
        }
    }
}