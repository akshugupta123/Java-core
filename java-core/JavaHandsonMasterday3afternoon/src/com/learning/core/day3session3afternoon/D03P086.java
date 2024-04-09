package com.learning.core.day3session3afternoon;

import java.util.*;

class Car2 implements Comparable<Car2> {
    private String name;
    private double price;

    public Car2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " " + price;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car2 car = (Car2) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    // Override compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car2 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D03P086 {
    public static void main(String[] args) {
        // Create TreeMap to store car details
        TreeMap<Car2, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car2("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car2("Benz", 900000.0), 900000.0);
        carMap.put(new Car2("BMW", 500000.0), 500000.0);
        carMap.put(new Car2("Audi", 400000.0), 400000.0);

        // Retrieve the key-value mapping associated with the greatest price
        Map.Entry<Car2, Double> greatestEntry = carMap.lastEntry();
        System.out.println(greatestEntry.getKey());

        // Retrieve the key-value mapping associated with the least price
        Map.Entry<Car2, Double> leastEntry = carMap.firstEntry();
        System.out.println(leastEntry.getKey());
    }
}
