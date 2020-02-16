package com.pm.calculation;

import java.util.Scanner;

public class Substract
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int a = scanner.nextInt();
        switch (a % 2)
        {
            case 0:
                System.out.println("Twoja liczba jest parzysta");
                break;
            case 1:
                System.out.println("Twoja liczba jest nieparzysta");
                break;

        }
    }

}
