package kz.runtime.springpractice1.controller;

import kz.runtime.springpractice1.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @GetMapping("/products")
    public String getProducts(Model model) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Alpen Gold", 890));
        productList.add(new Product("Ritter Sport", 500));
        productList.add(new Product("Chocolate Kazakhstan", 650));
        model.addAttribute("products", productList);
        return "products";
    }
}