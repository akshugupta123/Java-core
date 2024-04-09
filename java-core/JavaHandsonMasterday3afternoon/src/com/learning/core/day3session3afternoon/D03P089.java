package com.learning.core.day3session3afternoon;

import java.util.Hashtable;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
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
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }
}

public class D03P089 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined employee details
        Employee emp1 = new Employee(101, "John", "HR", "Manager");
        Employee emp2 = new Employee(102, "Alice", "Finance", "Accountant");
        Employee emp3 = new Employee(103, "Bob", "IT", "Developer");
        Employee emp4 = new Employee(104, "Emily", "Marketing", "Coordinator");

        // Store employee details in the Hashtable using employee id as key
        employeeTable.put(emp1.getId(), emp1);
        employeeTable.put(emp2.getId(), emp2);
        employeeTable.put(emp3.getId(), emp3);
        employeeTable.put(emp4.getId(), emp4);

        // Verify whether the Hashtable is empty or not
        System.out.println(employeeTable.isEmpty());
    }
}
