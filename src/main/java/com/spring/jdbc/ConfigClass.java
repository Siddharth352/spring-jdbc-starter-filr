package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.studentDaoImplement.studentDaoimple;
import com.spring.studentDaoInterface.studentDao;

@Configuration
@ComponentScan(basePackages = {"com.spring.studentDaoImplement"})
public class ConfigClass {
	
	@Bean("ds")
	public DriverManagerDataSource generateds() {	
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/root");
		ds.setUsername("root");
		ds.setPassword("");		
		return ds;
		
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate generateJdbctemp() {
		
		JdbcTemplate template = new JdbcTemplate(generateds());
		
		return template;
	}
	
	
//	@Bean("studentdaoimple")
//	public studentDao generatestudentdao() {		
//		studentDaoimple sdi = new studentDaoimple();
//		sdi.setTemplate(generateJdbctemp());
//		return sdi;		
//		
//	}
//	
	
	
	

}
