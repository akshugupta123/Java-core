package com.learning.core.day3session3morning;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
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
    public int compareTo(Person person) {
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
        Person person = (Person) obj;
        return id == person.id;
    }
}

public class D03P075 {
    public static void main(String[] args) {
        // Display input values
        System.out.println("Input:");

        // Create TreeSet to store person details
        TreeSet<Person> persons = new TreeSet<>();

        // Add predefined person information with input display
        persons.add(new Person(1, "Alice", 22, 1500.0));
        System.out.println("Id=1, name=Alice, age=22, salary=1500.0");
        
        persons.add(new Person(2, "Bob", 25, 1800.0));
        System.out.println("Id=2, name=Bob, age=25, salary=1800.0");
        
        persons.add(new Person(3, "Charlie", 30, 2200.0));
        System.out.println("Id=3, name=Charlie, age=30, salary=2200.0");
        
        persons.add(new Person(4, "David", 28, 2000.0));
        System.out.println("Id=4, name=David, age=28, salary=2000.0");
        
        persons.add(new Person(5, "John", 32, 1999.0));
        System.out.println("Id=5, name=John, age=32, salary=1999.0");
        
        persons.add(new Person(6, "Tom", 42, 3999.0));
        System.out.println("Id=6, name=Tom, age=42, salary=3999.0");

        // Print persons details whose age is greater than 25
        System.out.println("\nOutput:");
        for (Person person : persons) {
            if (person.getAge() > 25) {
                System.out.println(person);
            }
        }
    }
}