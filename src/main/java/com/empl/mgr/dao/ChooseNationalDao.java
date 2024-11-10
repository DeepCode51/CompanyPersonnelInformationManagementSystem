package com.empl.mgr.dao;

import org.springframework.stereotype.Repository;

import com.empl.mgr.dao.support.AbstractDao;
import com.empl.mgr.model.TeChooseNational;

@Repository
public class ChooseNationalDao extends AbstractDao<TeChooseNational> {

	@Override
	public Class<TeChooseNational> getEntityClass() {
		// TODO Auto-generated method stub
		return TeChooseNational.class;
	}

}
