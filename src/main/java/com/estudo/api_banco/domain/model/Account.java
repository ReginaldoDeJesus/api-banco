package com.estudo.api_banco.domain.model;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "tb_accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;
    private String agency;

    @Column(scale = 2, precision = 13)
    private BigInteger balance;

    @Column(name= "additional_limit", scale = 2, precision = 13)
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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public BigInteger getLimit() {
        return limit;
    }

    public void setLimit(BigInteger limit) {
        this.limit = limit;
    }
}
