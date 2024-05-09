package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Entity.EmployeeProfessional;

public interface EmployeeProfessionalRepository extends JpaRepository<EmployeeProfessional, Long> {

}
