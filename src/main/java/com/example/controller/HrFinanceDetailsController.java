package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.HrAndFinance;
import com.example.service.EmployeeService;

@Controller
public class HrFinanceDetailsController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/hrfinance")
    public String showHrFinanceForm(Model model) {
        model.addAttribute("employeeHrFinance", new HrAndFinance());
        return "hrFinanceForm";
    }

    @PostMapping("/employee/hrfinance")
    public String saveHrFinanceDetails(@ModelAttribute("employeeHrFinance") HrAndFinance employeeHrFinance) {
        employeeService.createEmployeeHrFinance(employeeHrFinance);
        return "redirect:/employee/personal"; // Redirect back to the personal details section
    }
}

