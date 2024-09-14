package com.row_mapper;

import com.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
    }
}
