-- Create Database
CREATE DATABASE IF NOT EXISTS employee_db;

-- Use Database
USE employee_db;

-- Create Employee Table
CREATE TABLE IF NOT EXISTS employee (

    id INT PRIMARY KEY AUTO_INCREMENT,

    name VARCHAR(100) NOT NULL,

    department VARCHAR(100) NOT NULL,

    salary DOUBLE NOT NULL

);

-- Sample Data
INSERT INTO employee (name, department, salary)
VALUES
('Rahul Sharma', 'IT', 55000),
('Priya Verma', 'HR', 48000),
('Amit Kumar', 'Finance', 62000),
('Sneha Reddy', 'Marketing', 51000),
('Arjun Singh', 'Operations', 59000);
