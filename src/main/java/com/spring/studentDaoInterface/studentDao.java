package com.spring.studentDaoInterface;
import com.spring.jdbc.*;
public interface studentDao {
	
	public int insert(student s);
	public student getstudent(int id);
	
	
}
