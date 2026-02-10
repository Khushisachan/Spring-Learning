package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext( "config.xml");
        Employee e = (Employee) context.getBean("person");
        System.out.println(e.getName());
        System.out.println(e.getEid());
        System.out.println(e.getCompanyName());

        context.close();
        System.out.println("container closed");

        // dependency Injection -three ways
//        1.setter
//        2.constructor
//        3.fields-variable level

    }
}