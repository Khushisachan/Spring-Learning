package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
        Product p = (Product) context.getBean("person");
        System.out.println(p.getpName());
        System.out.println(p.getPrice());

        context.close();
        System.out.println("container closed");

    }
}