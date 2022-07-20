package com.rohit.spring.springadvance.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.rohit.spring.springadvance.springjdbc.employee.dao.rowmapper.EmployeeRowmapper;
import com.rohit.spring.springadvance.springjdbc.employee.dto.Employee;
import com.rohit.spring.springadvance.springjdbc.employee.dto.EmployeeDao;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {

		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?,lastname=? where id=? ";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from  employee where id=? ";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {

		String sql = "select * from employee where id=?";
		EmployeeRowmapper rowmapper = new EmployeeRowmapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return emp;
	}

	@Override
	public List<Employee> reaDList() {

		String sql = "select * from employee";
		EmployeeRowmapper rowmapper = new EmployeeRowmapper();
		List<Employee> employeelist = jdbcTemplate.query(sql, rowmapper);
		return employeelist;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
