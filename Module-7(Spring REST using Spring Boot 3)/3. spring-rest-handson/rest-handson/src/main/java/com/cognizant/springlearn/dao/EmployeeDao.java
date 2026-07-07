package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.model.Department;
import com.cognizant.springlearn.model.Employee;

@Repository
public class EmployeeDao {

    private static List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {

        Department d1 = new Department(1, "IT");
        Department d2 = new Department(2, "HR");

        EMPLOYEE_LIST.add(new Employee(101, "Agalya", 45000.0, d1));
        EMPLOYEE_LIST.add(new Employee(102, "Rahul", 50000.0, d2));
        EMPLOYEE_LIST.add(new Employee(103, "Priya", 55000.0, d1));
        EMPLOYEE_LIST.add(new Employee(104, "Kumar", 60000.0, d2));

    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}