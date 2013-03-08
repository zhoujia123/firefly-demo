package com.firefly.demo.view.intercepter;

import com.firefly.annotation.Inject;
import com.firefly.annotation.Interceptor;
import com.firefly.demo.domain.Food;
import com.firefly.demo.service.FoodService;
import com.firefly.mvc.web.HandlerChain;
import com.firefly.mvc.web.View;
import com.firefly.utils.log.Log;
import com.firefly.utils.log.LogFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午1:54
 * To change this template use File | Settings | File Templates.
 */
@Interceptor(uri = "/food*", order = 0)
public class FoodInterceptor {

    Log log = LogFactory.getInstance().getLog("demo-log");

    @Inject
    FoodService foodService;

    public View dispose(HandlerChain chain, HttpServletRequest request, HttpServletResponse response) {
        Food food = new Food();
        food.setName("apple");
        food.setPrice(8.0f);
        request.setAttribute("fruit0", food);

        food = foodService.getFood("strawberry");
        request.setAttribute("strawberry", food);
        log.info("food interceptor 0 : {}", food);

        return chain.doNext(request, response, chain);
    }

}
