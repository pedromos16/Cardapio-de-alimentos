package com.example.cardapiodealimentos.food;

import jakarta.persistence.*;
import lombok.*;

//@Data
@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    //em aplicação real não se usar ".IDENTITY" e sim ".UUID" por segurança
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String image;
    private Integer price;

    //ou use o @Data que gera getter e setter ou coloque manualmnete se não os dados do banco vem vazios

    public Food(FoodRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
