package com.example.controller;

import com.example.Entity.ProfessionalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.PersonalDetails;
import com.example.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonalDetailsController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/professional")
    public String showProfessionalForm(Model model, @RequestParam(value = "employeeId", required = false) Long employeeId) {
        if (employeeId == null) {
            return "redirect:/"; // Redirect to the personal details form if employeeId is not present
        }
        model.addAttribute("professionalDetails", new ProfessionalDetails());
        model.addAttribute("employeeId", employeeId); // Add employeeId to model
        return "professionalDetails";
    }


    @PostMapping("/save")
    public String saveProfessionalDetails(@ModelAttribute("professionalDetails") ProfessionalDetails professionalDetails, Model model) {
        Long employeeId = professionalDetails.getEmployeeId(); // Retrieve employeeId from model
        professionalDetails.setEmployeeId(employeeId); // Set employeeId in ProfessionalDetails entity
        employeeService.createEmployeeProfessional(professionalDetails);
        return "redirect:/success";
    }

    @GetMapping("/")
    public String showPersonalForm(Model model) {
        model.addAttribute("personalDetails", new PersonalDetails());
        return "personalDetails";
    }

    @PostMapping("/employee/personal")
    public String savePersonalDetails(@ModelAttribute("personalDetails") PersonalDetails personalDetails, Model model) {
        employeeService.createEmployeePersonal(personalDetails);
        model.addAttribute("employeeId", personalDetails.getEmployeeId());
        return "redirect:/employee/professional?employeeId=" + personalDetails.getEmployeeId();
    }
}

