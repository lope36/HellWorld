package com.pm.calculation;

import java.util.Scanner;

public class kon {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int a = scanner.nextInt();
        System.out.print("Podaj dzielnik: ");
        int b = scanner.nextInt();
        for (int i = a; i> 0; i--)
        {
            if (i%b==0)
            System.out.println("twoja liczba jest podzielna przez:   " + i);
        }


    }
}