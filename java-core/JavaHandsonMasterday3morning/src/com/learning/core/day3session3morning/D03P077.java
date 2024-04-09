package com.learning.core.day3session3morning;

import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person2(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person2 person) {
        return Integer.compare(this.id, person.id);
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person2 person = (Person2) obj;
        return id == person.id;
    }
}

public class D03P077 {
    public static void main(String[] args) {
        // Create TreeSet to store person details
        TreeSet<Person2> persons = new TreeSet<>();

        // Add predefined person information
        persons.add(new Person2(1, "Jerry", 22, 999.0));
        persons.add(new Person2(2, "Smith", 25, 2999.0));
        persons.add(new Person2(3, "Popeye", 30, 5999.0));
        persons.add(new Person2(4, "Jones", 28, 6999.0));
        persons.add(new Person2(5, "John", 32, 1999.0));
        persons.add(new Person2(6, "Tom", 42, 3999.0));

        // Print names of persons in uppercase
        for (Person2 person : persons) {
            System.out.print(person + " ");
        }
    }
}

