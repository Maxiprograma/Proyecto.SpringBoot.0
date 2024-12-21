package com.example.SpringBootRest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="articulo")
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
// double price

    @Column(name = "nombre", unique = true)
    private String nombreArticulo;

    @Column(name = "precio")
    private double price;

}

