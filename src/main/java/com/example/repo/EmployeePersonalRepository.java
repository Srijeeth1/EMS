package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.EmployeePersonal;

public interface EmployeePersonalRepository extends JpaRepository<EmployeePersonal, Long> {
	/* public EmployeePersonal findFirstByOrderByIdDesc(); */
}
