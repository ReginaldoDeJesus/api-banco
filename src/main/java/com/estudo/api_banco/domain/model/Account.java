package com.estudo.api_banco.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
public class Account {

    @Id
    private Long id;
    private String number;
    private String agency;
    private BigInteger balance;
    private BigInteger limit;

}
