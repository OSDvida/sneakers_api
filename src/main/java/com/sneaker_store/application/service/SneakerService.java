package com.sneaker_store.application.service;

import com.sneaker_store.domain.Sneaker;
import com.sneaker_store.domain.repository.SneakerRepository;
import com.sneaker_store.presentation.dto.SneakerDTO;
import com.sneaker_store.presentation.mapper.SneakerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class SneakerService {
    private final SneakerRepository sneakerRepository;
    private final SneakerMapper sneakerMapper;

    public List<SneakerDTO> findAll(){
        List<Sneaker> sneakers = sneakerRepository.findAll();
        return sneakerMapper.toDTOList(sneakers);
    }

}
