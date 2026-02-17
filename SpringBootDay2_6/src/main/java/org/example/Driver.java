package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
        Laptop laptop = (Laptop) context.getBean("person");
        System.out.println(laptop.getBrand());
        System.out.println(laptop.getPrice());
        System.out.println(laptop.getLid());

        context.close();
        System.out.println("container closed");


    }
}