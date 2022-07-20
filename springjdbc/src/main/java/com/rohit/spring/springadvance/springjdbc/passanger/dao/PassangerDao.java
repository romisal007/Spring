package com.rohit.spring.springadvance.springjdbc.passanger.dao;

import java.util.List;

import com.rohit.spring.springadvance.springjdbc.passanger.dto.Passanger;

public interface PassangerDao {

	int create(Passanger passanger);
	int update(Passanger passanger);
	int delete(int id);
	Passanger read(int id);
	List<Passanger> readList();
	
	
}
