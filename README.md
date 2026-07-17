# Employee Management System

A Java-based Employee Management System that performs CRUD (Create, Read, Update, Delete) operations using JDBC and MySQL. This project provides a simple console-based interface for managing employee records.

---

## 🚀 Features

- Add Employee
- View All Employees
- Search Employee by ID
- Update Employee Details
- Delete Employee
- Menu-driven Console Application
- MySQL Database Integration
- JDBC Connectivity

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Maven
- IntelliJ IDEA / Eclipse

---

## 📂 Project Structure

```
employee-management-system/
│
├── src/
│   ├── dao/
│   │   └── EmployeeDAO.java
│   ├── model/
│   │   └── Employee.java
│   ├── util/
│   │   └── DBConnection.java
│   └── Main.java
│
├── database/
│   └── employee.sql
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## 🗄️ Database Setup

1. Install MySQL.
2. Open MySQL Workbench.
3. Run the `database/employee.sql` script.
4. Update the database username and password in `DBConnection.java`.

Example:

```java
private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
private static final String USERNAME = "root";
private static final String PASSWORD = "your_password";
```

---

## ▶️ Run the Project

1. Clone the repository.

```bash
git clone https://github.com/your-username/employee-management-system.git
```

2. Open the project in IntelliJ IDEA or Eclipse.

3. Install Maven dependencies.

4. Run `Main.java`.

---

## 📸 Sample Menu

```
========== Employee Management System ==========
1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Update Employee
5. Delete Employee
6. Exit
```

---

## 📌 Future Improvements

- Java Swing GUI
- Spring Boot REST API
- User Login Authentication
- Search by Department
- Employee Pagination
- Export Employee Data to Excel or PDF

---

## 👩‍💻 Author

**Divyashree KN**

Computer Science & Engineering (AI & ML)

---

## 📄 License

This project is created for learning and educational purposes.
