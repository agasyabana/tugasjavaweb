package com.example.libr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("categories")  public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("title", "Master Category");
        model.addAttribute("categories", categoryRepository.findAll());
        return "categories/index";
    }

}
