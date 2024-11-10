package com.empl.mgr.service;

import com.empl.mgr.constant.MethodType;
import com.empl.mgr.support.JSONReturn;

public abstract interface ModuleService {

	public abstract JSONReturn findMenu(String acctName);

	public abstract JSONReturn findModuleParameter(String moduleCode, String acctName);

	public abstract JSONReturn findBreadcrumb(String moduleCode);

	public abstract JSONReturn findAllModule(long roleId);

	public abstract JSONReturn setRoleSecureValid(long rold, String code, int type, boolean add);

	public abstract boolean secureValid(String userName, String[] code, MethodType type);

}
