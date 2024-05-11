package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.PersonalDetails;

public interface EmployeePersonalRepository extends JpaRepository<PersonalDetails, Long> {
	 public PersonalDetails findFirstByOrderByIdDesc();

}
