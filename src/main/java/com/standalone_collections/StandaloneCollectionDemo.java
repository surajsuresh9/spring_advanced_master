package com.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollectionDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("singleton_collection_config.xml");
        ProductList list = (ProductList) ac.getBean("product");
        System.out.println(list);
    }
}
