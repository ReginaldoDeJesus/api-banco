package com.estudo.api_banco.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Feature {

    @Id
    private Long id;
    private String icon;
    private String description;
}
