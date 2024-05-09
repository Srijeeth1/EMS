package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EmployeePersonal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;
	private String gender;
    private Long mobileNumber;
    private Long emergencyContactNumber;
    private String personalMailId;
    private String address;
    private Long aadharCardNumber;
    @OneToOne(mappedBy = "employeePersonal")
    private EmployeeProfessional employeeProfessional;

    @OneToOne(mappedBy = "employeePersonal")
    private Project employeeProjectDetails;

    @OneToOne(mappedBy = "employeePersonal")
    private HrAndFinance employeeHrFinance;
    
    public EmployeePersonal() {
    }

    public EmployeePersonal(String name, Integer age, String gender, Long mobileNumber, Long emergencyContactNumber, String personalMailId, String address, Long aadharCardNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.emergencyContactNumber = emergencyContactNumber;
        this.personalMailId = personalMailId;
        this.address = address;
        this.aadharCardNumber = aadharCardNumber;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(Long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getPersonalMailId() {
		return personalMailId;
	}

	public void setPersonalMailId(String personalMailId) {
		this.personalMailId = personalMailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(Long aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public EmployeeProfessional getEmployeeProfessional() {
		return employeeProfessional;
	}

	public void setEmployeeProfessional(EmployeeProfessional employeeProfessional) {
		this.employeeProfessional = employeeProfessional;
	}

	public Project getEmployeeProjectDetails() {
		return employeeProjectDetails;
	}

	public void setEmployeeProjectDetails(Project employeeProjectDetails) {
		this.employeeProjectDetails = employeeProjectDetails;
	}

	public HrAndFinance getEmployeeHrFinance() {
		return employeeHrFinance;
	}

	public void setEmployeeHrFinance(HrAndFinance employeeHrFinance) {
		this.employeeHrFinance = employeeHrFinance;
	}
    
    
	

}
