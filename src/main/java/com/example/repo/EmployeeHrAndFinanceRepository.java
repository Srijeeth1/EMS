package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Entity.HrAndFinance;

public interface EmployeeHrAndFinanceRepository extends JpaRepository<HrAndFinance, Long> {

}
