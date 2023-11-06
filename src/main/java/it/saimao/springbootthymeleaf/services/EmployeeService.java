package it.saimao.springbootthymeleaf.services;

import it.saimao.springbootthymeleaf.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    boolean addEmployee(Employee employee);

    Employee getEmployeeById(Integer employeeId);

    void deleteEmployee(Integer employeeId);
}
