package com.firefly.demo.view.controller;

import com.firefly.annotation.Controller;
import com.firefly.annotation.HttpParam;
import com.firefly.annotation.PathVariable;
import com.firefly.annotation.RequestMapping;
import com.firefly.demo.domain.Book;
import com.firefly.mvc.web.HttpMethod;
import com.firefly.mvc.web.View;
import com.firefly.mvc.web.view.*;
import com.firefly.utils.log.Log;
import com.firefly.utils.log.LogFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午1:25
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class HelloController {

    Log log = LogFactory.getInstance().getLog("demo-log");

    @RequestMapping(value = "/hello")
    public View index(HttpServletRequest request) {
        request.setAttribute("hello", "你好 firefly!");
        return new JspView("/index.jsp");
    }

    @RequestMapping(value = "/hello/text")
    public View text(HttpServletRequest request) {
        log.info("into text output >>>>>>>>>>>>>>>>>");
        return new TextView("文本输出");
    }

    @RequestMapping(value = "/hello/text-?/?-?")
    public View text2(HttpServletRequest request, @PathVariable String[] args) {
        return new TextView("text-" + args[0] + "-" + args[1] + "-" + args[2]);
    }

    @RequestMapping(value = "/hello/redirect")
    public View hello5(HttpServletRequest request,
                       HttpServletResponse response) {
        return new RedirectView("/hello");
    }

    @RequestMapping(value = "/book/json", method = HttpMethod.POST)
    public View getBook(@HttpParam("book") Book book) {
        return new JsonView(book);
    }

    @RequestMapping(value = "/document/?/?")
    public View document(HttpServletRequest request, @PathVariable String[] args) {
        request.setAttribute("info", args);
        return new TemplateView("/index.html");
    }

}
