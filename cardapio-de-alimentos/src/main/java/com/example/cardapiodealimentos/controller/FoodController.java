package com.example.cardapiodealimentos.controller;

import com.example.cardapiodealimentos.food.Food;
import com.example.cardapiodealimentos.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List<Food> getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;
    }
}
