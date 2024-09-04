package com.sneaker_store.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @Column(name = "description", nullable = true, length = 1000)
    private String description;

    public Category() {
    }

    public Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {return id;};
    public void setId(Long id) {this.id = id;};

    public String getName() {return name;};
    public void setName(String name) {this.name = name;};

    public String getDescription() {return description;};
    public void setDescription(String description) {this.description = description;};


}
