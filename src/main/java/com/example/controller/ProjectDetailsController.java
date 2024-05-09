package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.Project;
import com.example.service.EmployeeService;

@Controller
public class ProjectDetailsController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/project")
    public String showProjectForm(Model model) {
        model.addAttribute("employeeProjectDetails", new Project());
        return "projectForm";
    }

    @PostMapping("/employee/project")
    public String saveProjectDetails(@ModelAttribute("employeeProjectDetails") Project employeeProjectDetails) {
        employeeService.createEmployeeProjectDetails(employeeProjectDetails);
        return "redirect:/employee/hrfinance"; // Redirect to the next section
    }
}
