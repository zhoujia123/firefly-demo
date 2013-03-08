package com.firefly.demo.view.controller;

import com.firefly.annotation.Controller;
import com.firefly.annotation.Inject;
import com.firefly.annotation.RequestMapping;
import com.firefly.demo.domain.User;
import com.firefly.demo.service.FoodService;
import com.firefly.mvc.web.View;
import com.firefly.mvc.web.view.TemplateView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
        return new TemplateView("/food.html");
    }

   @RequestMapping(value = "/template/demo_ifelse")
    public View templateDemo_ifelse(HttpServletRequest request){

       request.getSession().setAttribute("login","true");

       User user = new User(1,"Bob","bob123","bob@gmail.com",25);

       request.setAttribute("user",user);

       return new TemplateView("/template_demo_ifelse.html");

   }

    @RequestMapping(value = "/template/demo_for")
    public View templateDemo_for(HttpServletRequest request){

        int[] intArr= new int[]{1,3,4,8,2,9,7};

        request.setAttribute("intArr",intArr);

        User user1 = new User(1,"Bob","bob123","bob@gmail.com",25);
        User user2 = new User(2,"Judya","Judya123","judya@hotmail.com",23);

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        request.setAttribute("users",users);

        return new TemplateView("/template_demo_for.html");

    }

    @RequestMapping(value = "/template/demo_others")
    public View templateDemo_others(HttpServletRequest request){

        request.setAttribute("stage",2);

        User user1 = new User(1,"Bob","bob123","bob@gmail.com",25);
        User user2 = new User(2,"Judya","Judya123","judya@hotmail.com",23);

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);

        request.setAttribute("users",users);

        return new TemplateView("/template_demo_others.html");

    }



}
