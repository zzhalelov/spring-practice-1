//package kz.runtime.springpractice1.controller;
//
//import kz.runtime.springpractice1.model.Category;
//import kz.runtime.springpractice1.model.Product;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class ProductController {
//    List<Category> categoryList = new ArrayList<>();
//    List<Product> productList = new ArrayList<>();
//
//    public String addProducts(@RequestParam String name,
//                              @RequestParam String categoryName,
//                              Model model) {
//        Category category = null;
//        for (Category category1 : categoryList) {
//            if (category1.getName().equals(categoryName)) {
//                category = category1;
//                break;
//            }
//        }
//        if (category == null) {
//            model.addAttribute("message", "Указанной категории не существует");
//        } else {
//            Product product = new Product(name, categoryName);
//            productList.add(product);
//            model.addAttribute("message", "Товар добавлен!!!");
//        }
//        return "products";
//    }
//}