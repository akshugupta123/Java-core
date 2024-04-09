package com.learning.core.day3session3morning;

import java.util.TreeSet;

class Person1 implements Comparable<Person1> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person1 person) {
        return Integer.compare(this.id, person.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person1 person = (Person1) obj;
        return id == person.id;
    }
}

public class D03P076 {
    public static void main(String[] args) {
        // Create TreeSet to store person details
        TreeSet<Person1> persons = new TreeSet<>();

        // Add predefined person information
        persons.add(new Person1(1, "Jerry", 999, 999.0));
        persons.add(new Person1(2, "Smith", 29, 2999.0));
        persons.add(new Person1(3, "Popeye", 59, 5999.0));
        persons.add(new Person1(4, "Jones", 69, 6999.0));
        persons.add(new Person1(5, "John", 32, 1999.0));
        persons.add(new Person1(6, "Tom", 42, 3999.0));

        // Print persons details whose age is greater than 25
        for (Person1 person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}


