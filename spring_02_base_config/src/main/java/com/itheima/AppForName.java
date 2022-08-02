package com.itheima;

import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
        //获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        //BookDao bookDao = (BookDao)ctx.getBean("bookDao");
        //bookDao.save();

        BookService bookService = (BookService)ctx.getBean("service4");
        bookService.save();
    }
}
