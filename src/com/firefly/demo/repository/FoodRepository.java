package com.firefly.demo.repository;

import com.firefly.demo.domain.Food;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午12:05
 * To change this template use File | Settings | File Templates.
 */
public class FoodRepository {

    List<Food> food;


    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }
}
