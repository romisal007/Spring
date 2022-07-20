package com.rohit.spring.springadvance.springjdbc.employee.dto;

import java.util.List;

public interface EmployeeDao {

	int create(Employee employee);

	int update(Employee employee);
	int delete(int id);
	Employee read(int id);
	List<Employee> reaDList();
	
	
}
