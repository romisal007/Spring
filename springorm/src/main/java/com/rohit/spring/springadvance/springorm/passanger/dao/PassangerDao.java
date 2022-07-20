package com.rohit.spring.springadvance.springorm.passanger.dao;

import java.util.List;

import com.rohit.spring.springadvance.springorm.passanger.dto.Passanger;

public interface PassangerDao {

	int create(Passanger passanger);
	void update(Passanger passanger);
	void delete(Passanger passanger);
	Passanger read(int id);
	List<Passanger> readList();
	
	
}
