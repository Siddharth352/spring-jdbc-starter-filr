package com.spring.studentDaoImplement;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.student;
import com.spring.studentDaoInterface.studentDao;

public class studentDaoimple implements studentDao {
	
	private JdbcTemplate template;

	public int insert(student s) {
		
		String query = "Insert into user values (?,?,?)";
		int result = this.template.update(query,s.getId(),s.getName(),s.getCity());
		
		return result;
		
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	

}
