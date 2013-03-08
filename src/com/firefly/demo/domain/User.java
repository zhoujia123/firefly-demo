package com.firefly.demo.domain;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: luowei
 * Date: 13-3-8
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {

    Integer id;
    String name;
    String password;
    String role;
    String email;
    Integer age;

    public User() {
    }

    public User(Integer id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public User(Integer id, String name, String password,
                String email, Integer age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
