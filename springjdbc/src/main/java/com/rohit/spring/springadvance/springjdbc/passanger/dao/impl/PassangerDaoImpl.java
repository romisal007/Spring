package com.rohit.spring.springadvance.springjdbc.passanger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.rohit.spring.springadvance.springjdbc.passanger.dao.PassangerDao;
import com.rohit.spring.springadvance.springjdbc.passanger.dto.Passanger;
import com.rohit.spring.springadvance.springjdbc.passanger.rowmapper.PassangerRowmapper;

@Component("productDao")
public class PassangerDaoImpl implements PassangerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Passanger passanger) {

		String sql="insert into passanger values(?,?,?)";
		int result=jdbcTemplate.update(sql,passanger.getId(),passanger.getFirstName(),passanger.getLastName());
		return result;
	}

	@Override
	public int update(Passanger passanger) {
		String sql="update passanger set firstname=? , lastname=? where id=?";
		int result=jdbcTemplate.update(sql,passanger.getFirstName(),passanger.getLastName(),passanger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql="delete from  passanger  where id=?";
		int result=jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Passanger read(int id) {
		String sql="select * from passanger where id=?";
		PassangerRowmapper rowmapper=new PassangerRowmapper();
		Passanger passanger= jdbcTemplate.queryForObject(sql, rowmapper,id);
		return passanger;
	}

	@Override
	public List<Passanger> readList() {
		String sql="select * from passanger";
		PassangerRowmapper rowmapper=new PassangerRowmapper();
		List<Passanger> passanger= jdbcTemplate.query(sql, rowmapper);
		return passanger;
	}

}
