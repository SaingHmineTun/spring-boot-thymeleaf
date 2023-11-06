package it.saimao.springbootthymeleaf.repositories;

import it.saimao.springbootthymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
