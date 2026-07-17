package dao;

import model.Employee;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private Connection connection;

    public EmployeeDAO() {
        connection = DBConnection.getConnection();
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        String query = "INSERT INTO employee(name, department, salary) VALUES(?, ?, ?)";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDepartment());
            ps.setDouble(3, employee.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee added successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View Employees
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        String query = "SELECT * FROM employee";

        try {

            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                Employee employee = new Employee();

                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setDepartment(rs.getString("department"));
                employee.setSalary(rs.getDouble("salary"));

                employees.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    // Search Employee by ID
    public Employee getEmployeeById(int id) {

        String query = "SELECT * FROM employee WHERE id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Update Employee
    public void updateEmployee(Employee employee) {

        String query = "UPDATE employee SET name=?, department=?, salary=? WHERE id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDepartment());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee updated successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        String query = "DELETE FROM employee WHERE id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
