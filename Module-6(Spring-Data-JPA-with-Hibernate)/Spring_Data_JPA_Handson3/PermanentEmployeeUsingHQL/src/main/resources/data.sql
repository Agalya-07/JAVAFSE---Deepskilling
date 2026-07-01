-- =========================
-- DEPARTMENT DATA
-- =========================
INSERT INTO department (dept_name) VALUES ('IT');
INSERT INTO department (dept_name) VALUES ('HR');
INSERT INTO department (dept_name) VALUES ('SALES');

-- =========================
-- SKILL DATA
-- =========================
INSERT INTO skill (skill_name) VALUES ('Java');
INSERT INTO skill (skill_name) VALUES ('Spring Boot');
INSERT INTO skill (skill_name) VALUES ('SQL');
INSERT INTO skill (skill_name) VALUES ('Python');

-- =========================
-- EMPLOYEE DATA
-- dept_id refers department table
-- =========================
INSERT INTO employee (emp_name, salary, dept_id) VALUES ('Arun', 50000, 1);
INSERT INTO employee (emp_name, salary, dept_id) VALUES ('Kumar', 60000, 1);
INSERT INTO employee (emp_name, salary, dept_id) VALUES ('Divya', 45000, 2);
INSERT INTO employee (emp_name, salary, dept_id) VALUES ('Ravi', 70000, 3);