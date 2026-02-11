package com.jsp.driver;
import com.jsp.config.config;
import com.jsp.model.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        //it provides
        Student student =  context.getBean(Student.class);
        //OR
//        Student student = (Student) context.getBean("student");

        System.out.println(student);
        System.out.println(student.getRollNo());
        System.out.println(student.getName());

        context.close();
        System.out.println("container closed");

    }
}
