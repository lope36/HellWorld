package com.week2;

public class Company
{
    public static void main(String[] args) {
        Employee Emplayee1 = new Employee("Janusz", "Piesciwąs", 23);
        System.out.printf("pracownik ma na imię %s, nazwisko %s i %d lat", Emplayee1.getName(), Emplayee1.getLastName(), Emplayee1.getAge());
        System.out.println();
        Employee Emplayee2 = new Employee("Zbyszek", "Bąk", 65);
        System.out.printf("pracownik ma na imię %s, nazwisko %s i  %d lat", Emplayee2.getName(), Emplayee2.getLastName(), Emplayee2.getAge());

    }
}
