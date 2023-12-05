package com.example.cardapiodealimentos.food;

public record FoodResponseDTO(Integer id, String title, String image, Integer price) {
    //pode dar erro mas as annotations do Food corrigem os gets
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
