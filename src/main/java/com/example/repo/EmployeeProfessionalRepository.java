package com.example.repo;

import com.example.Entity.ProfessionalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeProfessionalRepository extends JpaRepository<ProfessionalDetails, Long> {

}
