package com.home.learn.zilla.service.spring.batch.dosomething;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class CisCodeItemMapper implements ParameterizedRowMapper<CisCodeItem> {

	private static final String FIELD_CIS_CODE                = "CIS_CODE";
	 
	public CisCodeItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		CisCodeItem item = new CisCodeItem();
		item.setCisCode(rs.getString(FIELD_CIS_CODE));
		return item;
	}

}
