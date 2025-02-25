package com.estudo.api_banco.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_news")
public class News extends BaseItem{
}
