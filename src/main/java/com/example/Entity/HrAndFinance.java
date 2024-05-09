package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class HrAndFinance {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hrName;
    private String pancardNumber;
    private Long bankAccountDetails;
    private String IFSCCode;
    @OneToOne
    @JoinColumn(name = "personal_id")
    private EmployeePersonal employeePersonal;
    
    public HrAndFinance() {
    	
    }
    
	public HrAndFinance(Long id, String hrName, String pancardNumber, Long bankAccountDetails, String iFSCCode) {
		super();
		this.id = id;
		this.hrName = hrName;
		this.pancardNumber = pancardNumber;
		this.bankAccountDetails = bankAccountDetails;
		IFSCCode = iFSCCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getPancardNumber() {
		return pancardNumber;
	}
	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}
	public Long getBankAccountDetails() {
		return bankAccountDetails;
	}
	public void setBankAccountDetails(Long bankAccountDetails) {
		this.bankAccountDetails = bankAccountDetails;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	public EmployeePersonal getEmployeePersonal() {
		return employeePersonal;
	}
	public void setEmployeePersonal(EmployeePersonal employeePersonal) {
		this.employeePersonal = employeePersonal;
	}
	
}
