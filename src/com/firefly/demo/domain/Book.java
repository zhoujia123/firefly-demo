package com.firefly.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午1:31
 * To change this template use File | Settings | File Templates.
 */
public class Book implements Serializable {

    Integer id;
    String title;
    String author;
    String publisher;
    Date publication;
    Float price;
    Float discount;

    public Book() {
    }

    public Book(Integer id, String title, String author, String publisher,
                Date publication, Float price, Float discount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publication = publication;
        this.price = price;
        this.discount = discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }
}
