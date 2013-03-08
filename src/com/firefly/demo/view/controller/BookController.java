package com.firefly.demo.view.controller;

import com.firefly.annotation.Controller;
import com.firefly.annotation.HttpParam;
import com.firefly.annotation.RequestMapping;
import com.firefly.demo.domain.Book;
import com.firefly.mvc.web.HttpMethod;
import com.firefly.mvc.web.View;
import com.firefly.mvc.web.view.TemplateView;
import com.firefly.utils.log.Log;
import com.firefly.utils.log.LogFactory;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午1:41
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class BookController {

    Log log = LogFactory.getInstance().getLog("demo-log");

    @RequestMapping(value = "/book/add")
    public View gotoCreateBook() {
        log.info("book to add >>>>>>>>>>>>>>>>>");
        return new TemplateView("/book_create.html");
    }

    @RequestMapping(value = "/book/create", method = HttpMethod.POST)
    public View createBook(@HttpParam("book") Book book) {
        log.info("adding book >>>>>>>>>>>>>>>>>");
//        book.setName("福尔摩斯探案全集");
        book.setAuthor("柯南·道尔");
        book.setId(90);
        return new TemplateView("/book.html");
    }
}
