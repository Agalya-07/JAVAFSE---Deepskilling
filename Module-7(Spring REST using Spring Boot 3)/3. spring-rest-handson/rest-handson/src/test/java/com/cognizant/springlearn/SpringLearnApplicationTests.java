package com.cognizant.springlearn;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.cognizant.springlearn.controller.DepartmentController;
import com.cognizant.springlearn.controller.EmployeeController;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringLearnApplicationTests {

    @Autowired
    private EmployeeController employeeController;

    @Autowired
    private DepartmentController departmentController;

    @Autowired
    private MockMvc mvc;

    @Test
    void contextLoads() {
        assertNotNull(employeeController);
        assertNotNull(departmentController);
    }

    @Test
    void testGetAllEmployees() throws Exception {
        mvc.perform(get("/employees"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetAllDepartments() throws Exception {
        mvc.perform(get("/departments"))
                .andExpect(status().isOk());
    }
}