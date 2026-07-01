package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.service.*;

@SpringBootApplication
public class OrmLearnApplication {

    static ApplicationContext context;

    static EmployeeService employeeService;
    static DepartmentService departmentService;
    static SkillService skillService;

    public static void main(String[] args) {

        context = SpringApplication.run(OrmLearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        testGetEmployee();
    }

    private static void testGetEmployee() {
        System.out.println(employeeService.get(1));
    }
}