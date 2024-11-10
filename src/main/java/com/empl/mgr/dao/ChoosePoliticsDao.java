package com.empl.mgr.dao;

import org.springframework.stereotype.Repository;

import com.empl.mgr.dao.support.AbstractDao;
import com.empl.mgr.model.TeChoosePolitics;

@Repository
public class ChoosePoliticsDao extends AbstractDao<TeChoosePolitics> {

	@Override
	public Class<TeChoosePolitics> getEntityClass() {
		// TODO Auto-generated method stub
		return TeChoosePolitics.class;
	}

}
