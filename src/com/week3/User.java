package com.week3;

import java.time.LocalDate;
import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(String tusk, String s, LocalDate parse) {
    }

    public static void main(String[] args) {
        System.out.println("Witaj");
        System.out.println("wybierz opcj podając numer: ");
        Scanner scanner = new Scanner(System.in);
        int option = 99;
        while (true){
            printMenu();
            option = scanner.nextInt();
            if (option ==1){
                System.out.println("podaj nazwe użytkownika: ");
            } else if (option ==2) {
            } else if (option ==0) {
                break;
            } else {
                System.out.println("niepoprawny numer: ");
        }
        
    }
        
}

    private static void printMenu() {
        System.out.println("0. zamknij aplikacje");
        System.out.println("1. dodaj użytkonika");
        System.out.println("2. zamknij aplikacje");
        System.out.println("3. zamknij aplikacje");
        System.out.println("4. zamknij aplikacje");
    }
}
