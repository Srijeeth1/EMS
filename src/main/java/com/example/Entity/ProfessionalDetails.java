package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class ProfessionalDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long employeeId;
    private String location;
    private String companyMailId;
    private String projectName;
    private String reportingManager;
    private String officeLocation;

    @OneToOne
    @JoinColumn(name = "personal_id")
    private PersonalDetails personalDetails;
    
    public ProfessionalDetails() {
    	
    }
    
	public ProfessionalDetails(Long id, Long employeeId, String location, String companyMailId, String projectName,
							   String reportingManager, String officeLocation, String billable) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.location = location;
		this.companyMailId = companyMailId;
		this.projectName = projectName;
		this.reportingManager = reportingManager;
		this.officeLocation = officeLocation;

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

	public PersonalDetails getEmployeePersonal() {
		return personalDetails;
	}
	public void setEmployeePersonal(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
    
}
