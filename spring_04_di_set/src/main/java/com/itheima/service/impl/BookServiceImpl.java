package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.SQLOutput;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    //删除业务层中使用new方式创建的Dao对象
    private BookDao bookDao;

    public BookServiceImpl() {
        System.out.println("constructor");
    }

    public  void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set.....");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init...");
    }
}
