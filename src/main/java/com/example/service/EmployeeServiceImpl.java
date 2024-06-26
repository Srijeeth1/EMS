package com.example.service;

//import java.util.List;

import com.example.Entity.ProfessionalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.PersonalDetails;
        import com.example.Entity.HrAndFinance;
import com.example.Entity.Project;
import com.example.repo.EmployeeHrAndFinanceRepository;
import com.example.repo.EmployeePersonalRepository;
import com.example.repo.EmployeeProfessionalRepository;
import com.example.repo.EmployeeProjectRepository;
//
//import jakarta.transaction.Transactional;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeePersonalRepository personalRepository;
    @Autowired
    private EmployeeProfessionalRepository professionalRepository;
    @Autowired
    private EmployeeProjectRepository projectDetailsRepository;
    @Autowired
    private EmployeeHrAndFinanceRepository hrFinanceRepository;

//    @Override
//    @Transactional
//    public EmployeePersonal createEmployeePersonal(EmployeePersonal employeePersonal, EmployeeProfessional employeeProfessional, List<Project> employeeProjectDetailsList, HrAndFinance employeeHrFinance) {
//        // Save the EmployeePersonal entity
//        EmployeePersonal savedPersonal = personalRepository.save(employeePersonal);
//
//        // Associate EmployeePersonal with EmployeeProfessional if provided
//        if (employeeProfessional != null) {
//            employeeProfessional.setEmployeePersonal(savedPersonal);
//            professionalRepository.save(employeeProfessional);
//        }
//
//        // Associate EmployeePersonal with EmployeeProjectDetailsList if provided
//        if (employeeProjectDetailsList != null && !employeeProjectDetailsList.isEmpty()) {
//            for (Project projectDetails : employeeProjectDetailsList) {
//                projectDetails.setEmployeePersonal(savedPersonal);
//                projectDetailsRepository.save(projectDetails);
//            }
//        }
//
//        // Associate EmployeePersonal with EmployeeHrFinance if provided
//        if (employeeHrFinance != null) {
//            employeeHrFinance.setEmployeePersonal(savedPersonal);
//            hrFinanceRepository.save(employeeHrFinance);
//        }
//
//        return savedPersonal;
//    }
@Override
    public PersonalDetails createEmployeePersonal(PersonalDetails personalDetails) {
		return personalRepository.save(personalDetails);
    	
    }
    
    @Override
    public ProfessionalDetails createEmployeeProfessional(ProfessionalDetails professionalDetails) {
        return professionalRepository.save(professionalDetails);
    }

    @Override
    public Project createEmployeeProjectDetails(Project employeeProjectDetails) {
        return projectDetailsRepository.save(employeeProjectDetails);
    }

    @Override
    public HrAndFinance createEmployeeHrFinance(HrAndFinance employeeHrFinance) {
        return hrFinanceRepository.save(employeeHrFinance);
    }

//    @Override
//	public List<EmployeePersonal> getAllEmployeeDetails() {
//		List<EmployeePersonal> employeePersonalList = personalRepository.findAll();
//		return employeePersonalList;
//	}

    @Override
    public Long getLastEmployeePersonalId() {
        PersonalDetails lastEmployee = personalRepository.findFirstByOrderByIdDesc();
        if (lastEmployee != null) {
            return lastEmployee.getId();
        } else {
            return null;
        }
    }
}
