package com.estudo.api_banco.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private Account account;
    private List<Feature> features;
    private Card card;
    private List<New> news;
}
