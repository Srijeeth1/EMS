package com.example.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Project {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String projectName;
	    private String clientName;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    private String pastProjects;
	    private String projectManager;
	    private String technicalLead;
	    @OneToOne
	    @JoinColumn(name = "personal_id")
	    private PersonalDetails personalDetails;
	    
	    public Project() {
	    	
	    }
	    
		public Project(Long id, String projectName, String clientName, LocalDate startDate, LocalDate endDate,
				String pastProjects, String projectManager, String technicalLead) {
			super();
			this.id = id;
			this.projectName = projectName;
			this.clientName = clientName;
			this.startDate = startDate;
			this.endDate = endDate;
			this.pastProjects = pastProjects;
			this.projectManager = projectManager;
			this.technicalLead = technicalLead;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getClientName() {
			return clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public String getPastProjects() {
			return pastProjects;
		}

		public void setPastProjects(String pastProjects) {
			this.pastProjects = pastProjects;
		}

		public String getProjectManager() {
			return projectManager;
		}

		public void setProjectManager(String projectManager) {
			this.projectManager = projectManager;
		}

		public String getTechnicalLead() {
			return technicalLead;
		}

		public void setTechnicalLead(String technicalLead) {
			this.technicalLead = technicalLead;
		}

		public PersonalDetails getEmployeePersonal() {
			return personalDetails;
		}

		public void setEmployeePersonal(PersonalDetails personalDetails) {
			this.personalDetails = personalDetails;
		}
		
		
	    
}
