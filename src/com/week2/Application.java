package com.week2;

public class Application
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "czerwony", 200);
        System.out.printf("pojazd ma %d koła, jest %s i może jechac" + " %d km/h", vehicle.getNumOfWheels(), vehicle.getColor(), vehicle.getVelocity());
        System.out.println();
        Vehicle v1 = new Vehicle(2,"zielony");
        System.out.printf("pojazd ma %d koła, jest %s i może jechac" + " %d km/h", v1.getNumOfWheels(), v1.getColor(), v1.getVelocity());
    }
}
