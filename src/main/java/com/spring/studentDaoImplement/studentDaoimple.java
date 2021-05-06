package com.spring.studentDaoImplement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.student;
import com.spring.studentDaoInterface.studentDao;

public class studentDaoimple implements studentDao {
	
	private JdbcTemplate template;

	public int insert(student s) {
		
		String query = "Insert into user values (?,?,?)";
		int result = this.template.update(query,s.getId(),s.getName(),s.getCity());
		
		return result;
		
	}
	
	public student getstudent(int id) {
		
		String query = "select * from user where id=?";
		RowMapper<student> rowmapper = new RowMapperimple();
		
		student result = template.queryForObject(query,rowmapper,id);
		return result;
		
	}
	

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
	

}
