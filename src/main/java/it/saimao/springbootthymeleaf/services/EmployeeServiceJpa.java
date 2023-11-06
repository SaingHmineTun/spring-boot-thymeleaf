package it.saimao.springbootthymeleaf.services;

import it.saimao.springbootthymeleaf.model.Employee;
import it.saimao.springbootthymeleaf.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class EmployeeServiceJpa implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1 != null;
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public void deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
