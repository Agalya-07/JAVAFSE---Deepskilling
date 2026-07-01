package com.cognizant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.entity.Employee;
import com.cognizant.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public List<String> getNames() {
        return repo.getAllNames();
    }

    public List<Employee> salaryGT(double sal) {
        return repo.getSalaryGreater(sal);
    }
}