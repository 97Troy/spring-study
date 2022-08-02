package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        //获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        BookDao bookDao1 = (BookDao)ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao)ctx.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);


    }
}
