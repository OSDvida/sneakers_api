package com.sneaker_store.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @GetMapping
    public String getBrandByName(){
        return "Nike";
    }
}
