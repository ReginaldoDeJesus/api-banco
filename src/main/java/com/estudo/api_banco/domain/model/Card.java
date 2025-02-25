package com.estudo.api_banco.domain.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name="available_limit", precision = 13, scale = 2)
    private BigInteger limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigInteger getLimit() {
        return limit;
    }

    public void setLimit(BigInteger limit) {
        this.limit = limit;
    }
}
