package com.example.cardapiodealimentos.food;

import jakarta.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private Integer price;
}
