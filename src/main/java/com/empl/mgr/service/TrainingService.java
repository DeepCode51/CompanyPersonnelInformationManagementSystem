package com.empl.mgr.service;

import com.empl.mgr.support.JSONReturn;

public abstract interface TrainingService {

	public abstract JSONReturn addTraining(String name, String description, String startTime, String endTime,
			boolean isInsertAttend, String acctName);

	public abstract JSONReturn modifyTraining(long id, String name, String description, String startTime,
			String endTime, boolean isInsertAttend, String acctName);

	public abstract JSONReturn findTrainingList(String searchValue, int page, String acctName);

	public abstract JSONReturn findTrainingPage(String searchValue, int page, String acctName);

	public abstract JSONReturn delete(long id, String acctName);

	public abstract JSONReturn findTrainingInfoById(long id, String acctName);

	public abstract JSONReturn start(long id, String acctName);

	public abstract JSONReturn stop(long id, String note, String enddate, String acctName);

	public abstract JSONReturn findRecord(long trainingId, String acctName);

	public abstract JSONReturn addTrainingByEmplId(long emplId, long trainingId, String acctName);

	public abstract JSONReturn delEmployeesTrainingRecord(long id, String acctName);

	public abstract JSONReturn stopEmployeesTraining(long id, String note, String acctName);

	public abstract JSONReturn evaluationEmployeesTraining(long id, String note, String acctName);

}
