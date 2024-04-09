package com.learning.core.day3session3afternoon;

import java.util.*;

class Car4 implements Comparable<Car4> {
    private String name;
    private double price;

    public Car4(String name, double price) {
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
        Car4 car = (Car4) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car4 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D03P088 {
    public static void main(String[] args) {
        // Create TreeMap to store car details
        TreeMap<Car4, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car4("Benz", 900000.0), 900000.0);
        carMap.put(new Car4("Audi", 600100.0), 600100.0);
        carMap.put(new Car4("Swift", 305000.0), 305000.0);
        carMap.put(new Car4("Bugatti", 80050.0), 80050.0);

        // Remove and get a key-value mapping associated with the greatest key
        Map.Entry<Car4, Double> removedEntry = carMap.pollLastEntry();
        System.out.println(removedEntry.getKey() + " " + removedEntry.getValue());

        // Replace the value mapped by the specified key with the new value
        double oldValue = 80050.0;
        double newValue = 80050.0;
        for (Map.Entry<Car4, Double> entry : carMap.entrySet()) {
            if (entry.getValue().equals(oldValue)) {
                entry.setValue(newValue);
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
