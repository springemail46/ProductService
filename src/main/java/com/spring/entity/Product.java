package com.spring.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String pname;
    private String type;
    private int qty;
    private BigDecimal price;
}
