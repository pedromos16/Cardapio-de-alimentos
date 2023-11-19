package com.example.cardapiodealimentos.food;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String image;
    private Integer price;

    //ou use o @Data que gera getter e setter ou coloque manualmnete se não os dados do banco vem vazios
}
