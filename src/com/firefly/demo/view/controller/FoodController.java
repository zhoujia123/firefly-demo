package com.firefly.demo.view.controller;

import com.firefly.annotation.Controller;
import com.firefly.annotation.Inject;
import com.firefly.annotation.RequestMapping;
import com.firefly.demo.service.FoodService;
import com.firefly.mvc.web.View;
import com.firefly.mvc.web.view.JspView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午2:20
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FoodController {

    @Inject
    FoodService foodService;

    @RequestMapping(value = "/food")
    public View index(HttpServletRequest request) {
        request.setAttribute("hello", "this is food index page !");
        return new JspView("/food.jsp");
    }





}
