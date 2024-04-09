package com.learning.core.day3session3morning;

import java.util.TreeSet;

class Person3 implements Comparable<Person3> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person3(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person3 person) {
        return Integer.compare(this.id, person.id);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person3 person = (Person3) obj;
        return id == person.id;
    }
}

public class D03P078 {
    public static void main(String[] args) {
        // Create TreeSet to store person details
        TreeSet<Person3> persons = new TreeSet<>();

        // Add predefined person information
        persons.add(new Person3(1, "Jerry", 22, 999.0));
        persons.add(new Person3(2, "Smith", 25, 2999.0));
        persons.add(new Person3(3, "Popeye", 30, 5999.0));
        persons.add(new Person3(4, "Jones", 28, 6999.0));
        persons.add(new Person3(5, "John", 32, 1999.0));
        persons.add(new Person3(6, "Tom", 42, 3999.0));

        // Calculate the sum of all salaries
        double sum = persons.stream().mapToDouble(Person3::getSalary).sum();

        // Print the sum of all salaries
        System.out.println(sum);
    }
}

