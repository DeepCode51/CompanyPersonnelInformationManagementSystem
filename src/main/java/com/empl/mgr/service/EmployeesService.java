package com.empl.mgr.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.empl.mgr.dto.EmployeesInfoDto;
import com.empl.mgr.support.JSONReturn;

public abstract interface EmployeesService {

	public abstract JSONReturn findChoose();

	public abstract JSONReturn saveEmployeesInfo(EmployeesInfoDto dto, String acctName);

	public abstract JSONReturn findEmployeesList(int serType, String serVal, long department, long position, int page,
			String acctName, int... emplType);

	public abstract JSONReturn findEmployeesPage(int serType, String serVal, long department, long position, int page,
			String acctName, int... emplType);

	public abstract JSONReturn enroll(long emId, String acctName);

	public abstract JSONReturn eliminate(long emId, String note, String string);

	public abstract JSONReturn findEmployeesInfo(long emplId);

	public abstract JSONReturn modifyEmployeesInfo(EmployeesInfoDto dto, String acctName);

	public abstract JSONReturn departure(long id, String note, String acctName);

	public abstract JSONReturn findTrainingRecord(long emplId, String acctName);

	public abstract JSONReturn findEmployeesList(long trainingId, long deptId, String searchVal, String acctName);

	public abstract JSONReturn addAllTraining(long trainingId, long deptId, String searchVal, String acctName);

	public abstract JSONReturn destroy(long emplId, String acctName);

	public abstract JSONReturn findDepartureNote(long emplId, String acctName);

	public abstract JSONReturn enrollEmployees(long emplId, String note, String acctName);

	public abstract JSONReturn uploadImg(MultipartFile imgFile, HttpServletRequest request, HttpServletResponse response)
			throws Exception;

	public abstract JSONReturn findEmployeesRecord(long emplId);

}
