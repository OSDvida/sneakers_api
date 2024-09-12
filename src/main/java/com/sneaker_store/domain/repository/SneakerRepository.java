package com.sneaker_store.domain.repository;

import com.sneaker_store.domain.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SneakerRepository extends JpaRepository<Sneaker, Long> {
}
