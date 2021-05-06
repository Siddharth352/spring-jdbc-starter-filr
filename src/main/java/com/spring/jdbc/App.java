package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.studentDaoImplement.studentDaoimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Here program start");
    	
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); 
    	
    	studentDaoimple studentimpclass = context.getBean("studentdaoimple",studentDaoimple.class);
    	
    	student s = new student();
    	s.setId(2);
    	s.setName("rahul");
    	s.setCity("jaipur");
    	
    	int result = studentimpclass.insert(s);
    	
    	System.out.println("number of rows affected"+result);
    	
    	
    }
}
