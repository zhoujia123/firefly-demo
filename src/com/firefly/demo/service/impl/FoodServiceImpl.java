package com.firefly.demo.service.impl;

import com.firefly.annotation.Component;
import com.firefly.annotation.Inject;
import com.firefly.demo.repository.FoodRepository;
import com.firefly.demo.domain.Food;
import com.firefly.demo.service.FoodService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午12:14
 * To change this template use File | Settings | File Templates.
 */
@Component("foodService")
public class FoodServiceImpl implements FoodService {

    //属性注入
    @Inject
    private FoodRepository foodRepository;

    @Override
    public Food getFood(String name) {
        List<Food> foodList = foodRepository.getFood();
        for (Food f : foodList) {
            if (f.getName().equals(name))
                return f;
        }
        return null;
    }

//    //方法注入,注意:方法注入只支持按类型自动注入
//    @Inject
//    public void setFoodRepository(FoodRepository foodRepository) {
//        this.foodRepository = foodRepository;
//    }
}
