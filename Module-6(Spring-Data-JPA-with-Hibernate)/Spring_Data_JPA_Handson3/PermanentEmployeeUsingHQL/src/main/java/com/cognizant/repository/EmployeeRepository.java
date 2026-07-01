package com.cognizant.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cognizant.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmpName(String name);

    @Query("select e from Employee e where e.salary > ?1")
    List<Employee> getSalaryGreater(double salary);

    @Query("select e.empName from Employee e")
    List<String> getAllNames();
}