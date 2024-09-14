package com;

import com.dao.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDAO employeeDAO = (EmployeeDAO) ctx.getBean("dao");
//        employeeDAO.create(new Employee(2, "Micheal", "Keaton"));
//        employeeDAO.update(new Employee(2, "John", "Ferguson"));
//        employeeDAO.delete(2);
//        System.out.println(employeeDAO.read(1));
        System.out.println(employeeDAO.readAll());
    }
}
