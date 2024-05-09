package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Entity.Project;

public interface EmployeeProjectRepository extends JpaRepository<Project, Long> {

}
