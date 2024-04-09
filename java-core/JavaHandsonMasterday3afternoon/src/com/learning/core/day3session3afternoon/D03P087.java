package com.learning.core.day3session3afternoon;

import java.util.*;

class Car3 implements Comparable<Car3> {
    private String name;
    private double price;

    public Car3(String name, double price) {
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
        Car3 car = (Car3) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car3 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D03P087 {
    public static void main(String[] args) {
        // Create TreeMap to store car details
        TreeMap<Car3, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car3("Benz", 900000.0), 900000.0);
        carMap.put(new Car3("Audi", 600100.0), 600100.0);
        carMap.put(new Car3("Swift", 305000.0), 305000.0);
        carMap.put(new Car3("Bugatti", 80050.0), 80050.0);

        // Retrieve and print the key-value mapping associated with the greatest price
        Map.Entry<Car3, Double> greatestEntry = carMap.lastEntry();
        System.out.println(greatestEntry.getKey() + " " + greatestEntry.getValue());

        // Retrieve and print the key-value mapping associated with the least price
        Map.Entry<Car3, Double> leastEntry = carMap.firstEntry();
        System.out.println(leastEntry.getKey() + " " + leastEntry.getValue());
    }
}
