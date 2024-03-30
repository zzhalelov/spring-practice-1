package kz.runtime.springpractice1.controller;

import kz.runtime.springpractice1.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {
    private List<Category> categoryList = new ArrayList<>();

    @GetMapping("/category")
    public String get(Model model) {
        model.addAttribute("categories", categoryList);
        return ("category");
    }

    @PostMapping("/category/create")
    public String createCategory(@RequestParam String name, Model model) {
        Category category = new Category(name);
        categoryList.add(category);

        model.addAttribute("categories", categoryList);
        model.addAttribute("message", "Категория " + name + " добавлена");
        return "/category";
    }
}