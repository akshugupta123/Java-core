package com.learning.core.day3session3afternoon;

import java.util.*;

class Car1 implements Comparable<Car1> {
    private String name;
    private double price;

    public Car1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car1 car = (Car1) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car1 other) {
        return this.name.compareTo(other.name);
    }
}

public class D03P085 {
    public static void main(String[] args) {
        TreeMap<Car1, Integer> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car1("Bugatti", 8005000.0), 1);
        carMap.put(new Car1("Swift", 3050000.0), 2);
        carMap.put(new Car1("Audi", 6001000.0), 3);
        carMap.put(new Car1("Mercedes Benz", 9000000.0), 4);

        // Retrieving all car details
        for (Map.Entry<Car1, Integer> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
