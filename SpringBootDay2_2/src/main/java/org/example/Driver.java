package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
        Phone phone = (Phone) context.getBean("person");
        System.out.println(phone.getModelName());
        System.out.println(phone.getCompanyName());
        System.out.println(phone.getPrice());

        context.close();
        System.out.println("container closed");


    }
}