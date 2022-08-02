package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("bookDao")
@Repository("bookDao")
@Scope
public class BookDaoImpl implements BookDao {
    @Value("${jdbc.name}")
    private String name;
    public void save(){
        System.out.println("book dao save..."+name);
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

}

