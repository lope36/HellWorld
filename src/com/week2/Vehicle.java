package com.week2;

public class Vehicle
{
private int numOfWheels;
private String color;
private int velocity = 100;

    public Vehicle(int numOfWheels, String color, int velocity) {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.velocity = velocity;
    }

    public Vehicle(int numOfWheels, String color) {
        this.numOfWheels = numOfWheels;
        this.color = color;
    }

    public int getNumOfWheels() {
    return numOfWheels;
}

    public String getColor() {
    return color;
}

    public int getVelocity() {
    return velocity;
}
}

