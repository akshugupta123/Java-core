
package com.learning.core.day3session3afternoon;

import java.util.*;

class Employee4 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee4(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + designation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee4 employee = (Employee4) obj;
        return id == employee.id;
    }
}

public class D03P0811 {
    public static void main(String[] args) {
        // Create a Hashtable to store employee details
        Hashtable<Integer, Employee4> employeeTable = new Hashtable<>();

        // Predefined employee details
        employeeTable.put(1001, new Employee4(1001, "Daniel", "Analyst", "L&D"));
        employeeTable.put(1002, new Employee4(1002, "Thomas", "Tester", "Testing"));
        employeeTable.put(1003, new Employee4(1003, "Robert", "Product Manager", "Development"));
        employeeTable.put(1004, new Employee4(1004, "Grace", "Tech Support", "HR"));

        // Add new employees if they don't exist
        addEmployee(employeeTable, 1005, "Charles", "QA Lead", "Testing");

        // Print employee details
        for (Employee4 employee : employeeTable.values()) {
            System.out.println(employee);
        }
    }

    private static void addEmployee(Hashtable<Integer, Employee4> employeeTable, int id, String name, String department, String designation) {
        if (!employeeTable.containsKey(id)) {
            employeeTable.put(id, new Employee4(id, name, department, designation));
        }
    }
}
