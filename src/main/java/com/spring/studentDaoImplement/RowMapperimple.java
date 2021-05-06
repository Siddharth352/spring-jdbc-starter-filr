package com.spring.studentDaoImplement;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.student;

public class RowMapperimple implements RowMapper<student> {

	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		student s = new student();
		
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setCity(rs.getString(3));
		
		return s;
	
	}

		
	
}
