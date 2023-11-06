package it.saimao.springbootthymeleaf.controller;

import it.saimao.springbootthymeleaf.model.Employee;
import it.saimao.springbootthymeleaf.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/list")
    public String employees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee/list";
    }

    @GetMapping("/add-employee")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee/add-employee";
    }

    @PostMapping("/add-employee")
    public String addEmployeeToDatabase(@ModelAttribute("employee") Employee employee) {
        boolean isAdded = employeeService.addEmployee(employee);
        // Redirect to request mapping
        return "redirect:/employee/list";
    }

    @GetMapping("/delete-employee")
    public String deleteEmployee(@RequestParam("employeeId") Integer employee_id) {
        employeeService.deleteEmployee(employee_id);
        return "redirect:/employee/list";
    }

    @GetMapping("/update-employee/{employeeId}")
    public String updateEmployee(@PathVariable("employeeId") Integer employeeId, Model model) {
        Employee employee = employeeService.getEmployeeById(employeeId);
        model.addAttribute("employee", employee);
        return "employee/add-employee";
    }



}
