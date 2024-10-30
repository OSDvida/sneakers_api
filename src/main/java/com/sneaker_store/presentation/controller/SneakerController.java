package com.sneaker_store.presentation.controller;

import com.sneaker_store.application.service.SneakerService;
import com.sneaker_store.domain.Sneaker;
import com.sneaker_store.domain.repository.SneakerRepository;
import com.sneaker_store.presentation.dto.SneakerDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sneakers")
@AllArgsConstructor
public class SneakerController {
    private SneakerService sneakerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SneakerDTO>> getSneakers() {
        return ResponseEntity.ok(sneakerService.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> createSneaker(@RequestBody SneakerDTO dto){
        sneakerService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
