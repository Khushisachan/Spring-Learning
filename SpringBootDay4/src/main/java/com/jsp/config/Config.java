package com.jsp.config;

import com.jsp.model.Student;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.jsp")
@PropertySource("app.properties")


public class Config {
//    @Bean(value = "student")
//    @Scope(value = "prototype")
//    @Scope(value = "singleton")
    //for different instance we use scope
//    public Student student(){
//        return new Student();
//    }
}
