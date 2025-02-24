package com.estudo.api_banco.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
public class Card {

    @Id
    private Long id;
    private String number;
    private BigInteger limit;
}
