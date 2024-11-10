package com.empl.mgr.dao;

import org.springframework.stereotype.Repository;

import com.empl.mgr.dao.support.AbstractDao;
import com.empl.mgr.model.TeTrainingNote;

@Repository
public class TrainingNoteDao extends AbstractDao<TeTrainingNote> {

	@Override
	public Class<TeTrainingNote> getEntityClass() {
		// TODO Auto-generated method stub
		return TeTrainingNote.class;
	}

}
