package com.empl.mgr.service;

public abstract interface EmployeesLogService {

	public abstract void save(long emplId, String acctName, int type, String note);

}
