package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Here program start");
    	
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml"); 
    	
    	System.out.println("Here object created");
    	
    	JdbcTemplate template = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	System.out.println("now template created");
    	
    	String query = "Create Table user (id int Primary Key, name varchar(26), city varchar(26))";
    	int result = template.update(query);
    	
    	System.out.println("number of rows affected"+result);
    	
    	
    }
}
