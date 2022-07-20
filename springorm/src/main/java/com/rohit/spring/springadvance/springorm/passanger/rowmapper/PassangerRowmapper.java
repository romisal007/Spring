package com.rohit.spring.springadvance.springorm.passanger.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rohit.spring.springadvance.springorm.passanger.dto.Passanger;

public class PassangerRowmapper implements RowMapper<Passanger> {

	@Override
	public Passanger mapRow(ResultSet rs, int rowNum) throws SQLException {

		Passanger pass= new Passanger();
		pass.setId(rs.getInt(1));
		pass.setFirstName(rs.getString(2));
		pass.setLastName(rs.getString(3));
		return pass;
	}

	
}
