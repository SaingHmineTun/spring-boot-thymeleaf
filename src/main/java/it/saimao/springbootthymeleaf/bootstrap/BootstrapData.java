package it.saimao.springbootthymeleaf.bootstrap;

import it.saimao.springbootthymeleaf.model.Employee;
import it.saimao.springbootthymeleaf.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BootstrapData implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        Employee employee1 = new Employee("Sai", "Mao", "saimao.muse@gmail.com");
        Employee employee2 = new Employee("Kham", "Hom", "khamhom.selan@gmail.com");
        Employee employee3 = new Employee("Leng", "Kham", "lengkham.namhkam@gmail.com");
        Employee employee4 = new Employee("Lao", "Aon", "laoaon.namhkam@gmail.com");
        if (employeeRepository.count() < 3) {
            employeeRepository.saveAll(List.of(employee1, employee2, employee3, employee4));
        }
    }
}
