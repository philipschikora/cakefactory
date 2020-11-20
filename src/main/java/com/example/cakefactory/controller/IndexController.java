package com.example.cakefactory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( path = "/")
public class IndexController {

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("title", "Cake Factory");
        return "index";
    }
}
