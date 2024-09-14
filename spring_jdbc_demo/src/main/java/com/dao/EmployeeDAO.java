package com.dao;

import com.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    int create(Employee employee);

    int update(Employee employee);

    int delete(int id);

    Employee read(int id);

    List<Employee> readAll();

}
