package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
        Books b = (Books) context.getBean("person");
        System.out.println(b.getBookName());
        System.out.println(b.getPrice());
        System.out.println(b.getAuthorName());

        context.close();
        System.out.println("container closed");

    }
}