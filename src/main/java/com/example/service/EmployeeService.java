package com.example.service;


import java.util.List;



//import java.util.List;

import com.example.Entity.EmployeePersonal;
import com.example.Entity.EmployeeProfessional;
import com.example.Entity.HrAndFinance;
import com.example.Entity.Project;

public interface EmployeeService {
	//public EmployeePersonal createEmployeePersonal(EmployeePersonal employeePersonal, EmployeeProfessional employeeProfessional, List<Project> employeeProjectDetailsList, HrAndFinance employeeHrFinance);
    public EmployeePersonal createEmployeePersonal(EmployeePersonal employeePersonal);
	public EmployeeProfessional createEmployeeProfessional(EmployeeProfessional employeeProfessional);
    public Project createEmployeeProjectDetails(Project employeeProjectDetails);
    public HrAndFinance createEmployeeHrFinance(HrAndFinance employeeHrFinance);
    public List<EmployeePersonal> getAllEmployeeDetails();
//    public Long getLastEmployeePersonalId();
}
