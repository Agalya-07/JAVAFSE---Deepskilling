class Employee {
    int employeeId;
    String name;
    String position;
    double salary;
    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    void display() {
        System.out.println(employeeId + " " + name + " " + position + " " + salary);
    }
}
public class EmployeeManagementSystem {
    Employee[] employees = new Employee[10];
    int count = 0;
    void addEmployee(Employee employee) {
        employees[count++] = employee;
    }
    void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
    void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }
    void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                break;
            }
        }
    }
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.addEmployee(new Employee(101, "Arun", "Manager", 50000));
        ems.addEmployee(new Employee(102, "Kumar", "Developer", 40000));
        ems.traverseEmployees();
        ems.searchEmployee(101);
        ems.deleteEmployee(102);
        System.out.println("After Deletion");
        ems.traverseEmployees();
    }
}
