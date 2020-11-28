package com.example.cakefactory.controller;

import com.example.cakefactory.service.PastryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/catalog")
public class CatalogController {

    private final PastryService pastryService;

    public CatalogController(PastryService pastryService) {
        this.pastryService = pastryService;
    }

    @GetMapping
    public String getCatalog(Model model) {
        var pastries = pastryService.findAll();
        pastries.forEach(System.out::println);
        return "catalog";
    }
}
