package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    	
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class); 
    	
    	studentDaoimple studentimpclass = context.getBean("studentdaoimple",studentDaoimple.class);
    	
    	
    	student result = studentimpclass.getstudent(2);
    	System.out.println(result);
    	
    	
    }
}
