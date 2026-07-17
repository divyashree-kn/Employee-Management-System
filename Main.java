import dao.EmployeeDAO;
import model.Employee;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeDAO employeeDAO = new EmployeeDAO();

        while (true) {

            System.out.println("\n========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee();
                    employee.setName(name);
                    employee.setDepartment(department);
                    employee.setSalary(salary);

                    employeeDAO.addEmployee(employee);
                    break;

                case 2:
                    List<Employee> employees = employeeDAO.getAllEmployees();

                    if (employees.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\nEmployee List");
                        System.out.println("----------------------------");
                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();

                    Employee emp = employeeDAO.getEmployeeById(id);

                    if (emp != null) {
                        System.out.println(emp);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDepartment = scanner.nextLine();

                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();

                    Employee updatedEmployee = new Employee(
                            updateId,
                            newName,
                            newDepartment,
                            newSalary
                    );

                    employeeDAO.updateEmployee(updatedEmployee);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = scanner.nextInt();

                    employeeDAO.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.println("Thank you for using Employee Management System.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
