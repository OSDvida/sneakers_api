package com.sneaker_store.presentation.mapper;

import com.sneaker_store.domain.Sneaker;
import com.sneaker_store.presentation.dto.SneakerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SneakerMapper {
    SneakerDTO toDTO(Sneaker sneaker);
    List<SneakerDTO> toDTOList(List<Sneaker> sneakers);
}
