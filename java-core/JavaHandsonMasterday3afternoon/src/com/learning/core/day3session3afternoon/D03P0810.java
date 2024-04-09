package com.learning.core.day3session3afternoon;

import java.util.Hashtable;

class Employee1 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee1(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee1 other = (Employee1) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class D03P0810 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee1> employeeTable = new Hashtable<>();

        // Predefined employee details
        Employee1 emp1 = new Employee1(1001, "John", "HR", "Manager");
        Employee1 emp2 = new Employee1(1002, "Alice", "Finance", "Accountant");
        Employee1 emp3 = new Employee1(1003, "Robert", "Development", "Product Manager");
        Employee1 emp4 = new Employee1(1004, "Emily", "Marketing", "Coordinator");

        // Store employee details in the Hashtable using employee id as key
        employeeTable.put(emp1.getId(), emp1);
        employeeTable.put(emp2.getId(), emp2);
        employeeTable.put(emp3.getId(), emp3);
        employeeTable.put(emp4.getId(), emp4);

        // Search for a specific Employee
        int searchId = 1003;
        if (employeeTable.containsKey(searchId)) {
            System.out.println(employeeTable.get(searchId));
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
