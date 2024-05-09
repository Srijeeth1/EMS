package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.EmployeePersonal;
import com.example.service.EmployeeService;

@Controller
public class PersonalDetailsController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String showPersonalForm(Model model) {
        model.addAttribute("employeePersonal", new EmployeePersonal());
        return "personalForm";
    }
    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        List<EmployeePersonal> employees = employeeService.getAllEmployeeDetails();
        model.addAttribute("employees", employees);
        return "employees"; // Return the name of the template to display the employees
    }
//    @PostMapping("/employee/personal")
//    public String savePersonalDetails(@ModelAttribute("employeePersonal") EmployeePersonal employeePersonal) {
//employeeService.createEmployeePersonal(employeePersonal);
//        return "redirect:/employee/professional"; // Redirect to the professional details form
//    }
    @PostMapping("/employee/personal")
    public String savePersonalDetails(@ModelAttribute("employeePersonal") EmployeePersonal employeePersonal) {
employeeService.createEmployeePersonal(employeePersonal);
        return "redirect:/employees"; // Redirect to the professional details form
    }
}

