package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.EmployeeProfessional;
import com.example.service.EmployeeService;

@Controller
public class ProfessionalDetailsController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/professional")
    public String showProfessionalForm(Model model) {
        model.addAttribute("employeeProfessional", new EmployeeProfessional());
        return "professionalForm";
    }

    @PostMapping("/employee/professional")
    public String saveProfessionalDetails(@ModelAttribute("employeeProfessional") EmployeeProfessional employeeProfessional) {
        employeeService.createEmployeeProfessional(employeeProfessional);
        return "redirect:/employee/project"; // Redirect to the next section
    }
}

