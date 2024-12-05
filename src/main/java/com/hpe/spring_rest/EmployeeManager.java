package com.hpe.spring_rest;

public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        initializeEmployees();
    }

    private void initializeEmployees() {
        employees.addEmployee(new Employee("001", "Raju", "Boga", "rj@gmail.com", "Developer"));
        employees.addEmployee(new Employee("002", "Akram", "Syed", "syed@gmail.com", "Security Analyst"));
        employees.addEmployee(new Employee("003", "Prasanna", "Vasaraju", "sanna@gmail.com", "Data Analyst"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}
