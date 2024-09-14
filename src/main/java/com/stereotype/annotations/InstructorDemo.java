package com.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstructorDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("stereotype_annotation_config.xml");
        Instructor instructor = (Instructor) ac.getBean("instructorObject");
        Instructor instructor2 = (Instructor) ac.getBean("instructorObject");
        System.out.println(instructor);
    }
}
