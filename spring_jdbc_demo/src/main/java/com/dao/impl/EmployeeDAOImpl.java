package com.dao.impl;

import com.dao.EmployeeDAO;
import com.entity.Employee;
import com.row_mapper.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("dao")
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //    public JdbcTemplate getJdbcTemplate() {
//        return jdbcTemplate;
//    }
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
    @Override
    public int create(Employee employee) {
        String sql = "insert into employee values (?,?,?)";
        int rowsAffected = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
        System.out.println(rowsAffected + " row(s) inserted");
        return rowsAffected;
    }

    @Override
    public int update(Employee employee) {
        String sql = "update employee set first_name=?, last_name=? where id=?";
        int rowsUpdated = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
        System.out.println(rowsUpdated + " row(s) updated");
        return rowsUpdated;
    }

    @Override
    public int delete(int id) {
        String sql = "delete from employee where id=?";
        int rowsDeleted = jdbcTemplate.update(sql, id);
        System.out.println(rowsDeleted + " row(s) deleted");
        return rowsDeleted;
    }

    @Override
    public Employee read(int id) {
        String sql = "select * from employee where id=?";
        Employee employee = jdbcTemplate.queryForObject(sql, (rs, i) -> {
            return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
        }, id);
        return employee;
    }

    @Override
    public List<Employee> readAll() {
        String sql = "select * from employee";
        List<Employee> employees = jdbcTemplate.query(sql, new EmployeeRowMapper());
        return employees;
    }
}
