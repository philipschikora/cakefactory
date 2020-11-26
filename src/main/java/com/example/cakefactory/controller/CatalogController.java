package com.example.cakefactory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( path = "/catalog")
public class CatalogController {

    @GetMapping
    public String getCatalog() {
        return "catalog";
    }
}
