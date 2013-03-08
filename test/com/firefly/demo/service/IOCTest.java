package com.firefly.demo.service;

import com.firefly.core.ApplicationContext;
import com.firefly.core.XmlApplicationContext;
import com.firefly.demo.domain.Food;
import com.firefly.utils.log.Log;
import com.firefly.utils.log.LogFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午12:23
 * To change this template use File | Settings | File Templates.
 */
public class IOCTest {

    static Log log = LogFactory.getInstance().getLog("demo-log");

    public static ApplicationContext applicationContext = new XmlApplicationContext("firefly.xml");

    @Test
    public void testInject() {
        FoodService foodService = applicationContext.getBean("foodService");
        Food food = foodService.getFood("apple");
        log.info("================ demo-log info ================");
        log.debug(food.getName());
        Assert.assertThat(food.getPrice(), is(5.3f));

        foodService = applicationContext.getBean(FoodService.class);
        food = foodService.getFood("strawberry");
        log.debug(food.getName());
        Assert.assertThat(food.getPrice(), is(10.00f));
    }

}
