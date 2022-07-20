package com.rohit.spring.springadvance.springorm.passanger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.rohit.spring.springadvance.springorm.passanger.dao.PassangerDao;
import com.rohit.spring.springadvance.springorm.passanger.dto.Passanger;

@Component("passangerDao")
public class PassangerDaoImpl implements PassangerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Passanger passanger) {

		int result=(int) hibernateTemplate.save(passanger);
		return result;
	}

	@Override
	@Transactional
	public void update(Passanger passanger) {
	 hibernateTemplate.update(passanger);
		
	}

	@Override
	@Transactional
	public void  delete(Passanger passanger) {
		 hibernateTemplate.delete(passanger);
		
	}

	@Override
	@Transactional
	public Passanger read(int id) {
		
		Passanger passanger= hibernateTemplate.get(Passanger.class,id);
		return passanger;
	}

	@Override
	@Transactional
	public List<Passanger> readList() {
		
		List<Passanger> passanger= hibernateTemplate.loadAll(Passanger.class);
		return passanger;
	}

}
