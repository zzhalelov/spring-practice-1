package kz.runtime.springpractice1.controller;

import kz.runtime.springpractice1.model.Category;
import kz.runtime.springpractice1.model.Product;
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
    private List<Product> productList = new ArrayList<>();

    @GetMapping("/category")
    public String get(Model model) {
        model.addAttribute("categories", categoryList);
        return ("category");
    }

    @PostMapping("/category/create")
    public String createCategory(@RequestParam String name, Model model) {
        boolean exists = false;
        for (Category category : categoryList) {
            if (category.getName().equals(name)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            model.addAttribute("message", "Такая категория уже есть");
        } else {
            Category category = new Category(name);
            categoryList.add(category);

            model.addAttribute("categories", categoryList);
            model.addAttribute("message", "Категория " + name + " добавлена");
        }
        return "/category";
    }

    @PostMapping("/category")
    public String addProducts(@RequestParam String name,
                              @RequestParam String categoryName,
                              Model model) {
        Category category = null;
        for (Category category1 : categoryList) {
            if (category1.getName().equals(categoryName)) {
                category = category1;
                break;
            }
        }
        if (category == null) {
            model.addAttribute("message", "Ошибка");
        } else {
            Product product = new Product(name, categoryName);
            productList.add(product);
            model.addAttribute("message", "Товар добавлен!!!");
        }
        return "products";
    }
}