package com.sneaker_store.presentation.controller;

import com.sneaker_store.application.service.BrandService;
import com.sneaker_store.domain.Brand;
import com.sneaker_store.domain.repository.BrandRepository;
import com.sneaker_store.presentation.dto.BrandDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brands")
@AllArgsConstructor
public class BrandController {
    private BrandService brandService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BrandDTO>> getbrands() {
        return ResponseEntity.ok(brandService.findAll());
    }
}
