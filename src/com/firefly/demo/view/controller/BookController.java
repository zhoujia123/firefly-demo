package com.firefly.demo.view.controller;

import com.firefly.annotation.Controller;
import com.firefly.annotation.HttpParam;
import com.firefly.annotation.RequestMapping;
import com.firefly.demo.domain.Book;
import com.firefly.demo.domain.User;
import com.firefly.mvc.web.HttpMethod;
import com.firefly.mvc.web.View;
import com.firefly.mvc.web.view.TemplateView;
import com.firefly.utils.log.Log;
import com.firefly.utils.log.LogFactory;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
//        book.setTitle("福尔摩斯探案全集");
        book.setAuthor("柯南·道尔");
        book.setId(90);
        return new TemplateView("/book.html");
    }

    @RequestMapping(value = "/book/list")
    public View listBood(HttpServletRequest request) throws ParseException {

        User user = new User(1,"luowei","admin");
        request.setAttribute("user",user);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Book book1 = new Book(1,"三国演义","罗贯中","人民日报出版社", sdf.parse("2002-01-01 12:30:00"),30.0f,0.8f);
        Book book2 = new Book(2,"水浒传","施耐庵","北京图书出版社", sdf.parse("2003-03-01 16:30:00"),32.0f,0.8f);
        Book book3 = new Book(3,"西游记","吴承恩","上海日报出版社", sdf.parse("2002-11-21 08:30:00"),35.0f,0.7f);
        Book book4 = new Book(1,"红楼梦","曹雪芹","中国古典文学出版社", sdf.parse("2000-01-20 10:30:00"),40.0f,0.7f);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        request.setAttribute("books",bookList);

        return new TemplateView("/list_book.html");
    }
}
