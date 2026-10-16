CREATE DATABASE IF NOT EXISTS emp
  CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE emp;

CREATE TABLE IF NOT EXISTS emp_detail (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Emp_name VARCHAR(100) NOT NULL,
    designation VARCHAR(100) NOT NULL,
    salary DECIMAL(10,2) NOT NULL
);

INSERT INTO emp_detail (Emp_name, designation, salary) VALUES
('Amit Shah', 'Manager', 75000.00),
('Neha Patel', 'Developer', 62000.00),
('Ravi Kumar', 'Accountant', 48000.00),
('Priya Mehta', 'Designer', 55000.00),
('Karan Joshi', 'Intern', 18000.00);

CREATE DATABASE IF NOT EXISTS assignment4
  CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE assignment4;

CREATE TABLE IF NOT EXISTS products (
    prodid INT AUTO_INCREMENT PRIMARY KEY,
    prodname VARCHAR(150) NOT NULL,
    prodcompnay VARCHAR(150) NOT NULL,
    prodprice DECIMAL(10,2) NOT NULL
);

INSERT INTO products (prodname, prodcompnay, prodprice) VALUES
('Laptop', 'Dell', 65000.00),
('Smartphone', 'Samsung', 32000.00),
('Headphones', 'Sony', 4500.00),
('Keyboard', 'Logitech', 1800.00),
('Monitor', 'LG', 14500.00);

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(190) NOT NULL
);

INSERT INTO users (name, email) VALUES
('abc', 'abc@gmail.com'),
('xyz', 'xyz@gmail.com'),
('pqr', 'pqr@gmail.com'),
('mnp', 'mnp@gmail.com');
