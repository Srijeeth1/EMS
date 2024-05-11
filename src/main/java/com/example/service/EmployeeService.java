package com.example.service;


//import java.util.List;

import com.example.Entity.PersonalDetails;
import com.example.Entity.ProfessionalDetails;
import com.example.Entity.HrAndFinance;
import com.example.Entity.Project;

public interface EmployeeService {
	//public EmployeePersonal createEmployeePersonal(EmployeePersonal employeePersonal, EmployeeProfessional employeeProfessional, List<Project> employeeProjectDetailsList, HrAndFinance employeeHrFinance);
    public PersonalDetails createEmployeePersonal(PersonalDetails personalDetails);
	public ProfessionalDetails createEmployeeProfessional(ProfessionalDetails professionalDetails);
    public Project createEmployeeProjectDetails(Project employeeProjectDetails);
    public HrAndFinance createEmployeeHrFinance(HrAndFinance employeeHrFinance);
   // public List<EmployeePersonal> getAllEmployeeDetails();
    public Long getLastEmployeePersonalId();
}
