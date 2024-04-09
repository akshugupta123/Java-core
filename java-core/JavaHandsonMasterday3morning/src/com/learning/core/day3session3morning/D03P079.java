package com.learning.core.day3session3morning;

import java.util.TreeSet;

class Person4 implements Comparable<Person4> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person4(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Person4 person) {
        return Integer.compare(this.id, person.id);
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person4 person = (Person4) obj;
        return id == person.id;
    }

    public String getName() {
        return name; // Return the name of the person
    }
}

public class D03P079 {
    public static void main(String[] args) {
        // Create TreeSet to store person details
        TreeSet<Person4> persons = new TreeSet<>();

        // Add predefined person information
        persons.add(new Person4(1, "Jerry", 22, 999.0));
        persons.add(new Person4(2, "Smith", 25, 2999.0));
        persons.add(new Person4(3, "Popeye", 30, 5999.0));
        persons.add(new Person4(4, "Jones", 22, 6999.0));
        persons.add(new Person4(5, "John", 32, 1999.0));
        persons.add(new Person4(6, "Tom", 42, 3999.0));

        // Find and print the first person whose name starts with 'J'
        for (Person4 person : persons) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break;
            }
        }
    }
}
