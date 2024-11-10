package com.empl.mgr.service;

import com.empl.mgr.support.JSONReturn;

public abstract interface DepartmentService {

	public abstract JSONReturn findDepartmentList(int page, String searchValue, String acctName);

	public abstract JSONReturn findDepartmentCount(int page, String searchValue);

	public abstract JSONReturn findDepartmentById(long deptId);

	public abstract JSONReturn modifyDepartment(long deptId, String name, String desc, String acctName);

	public abstract JSONReturn addDepartment(String name, String desc, String acctName);

	public abstract JSONReturn deleteDepartment(long deptId, String acctName);

	public abstract JSONReturn findAllDepartment();

	public abstract JSONReturn findDeptEmplList(long deptId, String acctName);

	public abstract JSONReturn setPrincipal(long deptId, long emplId, String acctName);

}
