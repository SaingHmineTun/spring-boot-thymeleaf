package it.saimao.springbootthymeleaf.services;

import it.saimao.springbootthymeleaf.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees;

    @PostConstruct
    private void loadEmployeeData() {
        employees = new ArrayList<>();
        Employee employee1 = new Employee("Sai", "Mao", "saimao.muse@gmail.com");
        Employee employee2 = new Employee("Kham", "Hom", "khamhom.selan@gmail.com");
        Employee employee3 = new Employee("Leng", "Kham", "lengkham.namhkam@gmail.com");
        employees.addAll(List.of(employee1, employee2, employee3));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return null;
    }

    @Override
    public void deleteEmployee(Integer employeeId) {

    }
}
