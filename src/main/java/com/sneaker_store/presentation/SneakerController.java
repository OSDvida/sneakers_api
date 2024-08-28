package com.sneaker_store.presentation;

import com.sneaker_store.domain.Sneaker;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sneakers")
public class SneakerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Sneaker> getSneakers() {

        Sneaker sneaker1 = new Sneaker("Air Jordan One", 1233.99, "BRA", 40.5, "AZUL");
        Sneaker sneaker2 = new Sneaker("Nike Dunk Valentine", 1200.99, "EU", 20, "VERMELHO");
        Sneaker sneaker3 = new Sneaker("Nike Dunk Game Royal", 850, "BRA", 42, "AZUL");

        return List.of(sneaker1, sneaker2, sneaker3);
    }
}
