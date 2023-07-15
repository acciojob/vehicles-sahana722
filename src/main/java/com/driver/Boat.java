package com.driver;

public class Boat {
    String name;
    int capacity;

    public Boat() {
    }

    public Boat(String name, int capacity) {

        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
