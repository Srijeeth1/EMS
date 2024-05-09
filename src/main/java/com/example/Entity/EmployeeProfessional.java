package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class EmployeeProfessional {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long employeeId;
    private String location;
    private String companyMailId;
    private String projectName;
    private String reportingManager;
    private String officeLocation;
    private boolean billable;
    @OneToOne
    @JoinColumn(name = "personal_id")
    private EmployeePersonal employeePersonal;
    
    public EmployeeProfessional() {
    	
    }
    
	public EmployeeProfessional(Long id, Long employeeId, String location, String companyMailId, String projectName,
			String reportingManager, String officeLocation, boolean billable) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.location = location;
		this.companyMailId = companyMailId;
		this.projectName = projectName;
		this.reportingManager = reportingManager;
		this.officeLocation = officeLocation;
		this.billable = billable;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompanyMailId() {
		return companyMailId;
	}
	public void setCompanyMailId(String companyMailId) {
		this.companyMailId = companyMailId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public boolean isBillable() {
		return billable;
	}
	public void setBillable(boolean billable) {
		this.billable = billable;
	}
	public EmployeePersonal getEmployeePersonal() {
		return employeePersonal;
	}
	public void setEmployeePersonal(EmployeePersonal employeePersonal) {
		this.employeePersonal = employeePersonal;
	}
    
}
