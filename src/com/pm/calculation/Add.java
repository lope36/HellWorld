package com.pm.calculation;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Add
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbe: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbe: ");
        int b = scanner.nextInt();
        System.out.print("Podaj trzezcią liczbe: ");
        int c = scanner.nextInt();

        double delta = (int) (Math.pow(b, 2) - 4 * a *c);
        double wynik = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("wynik %dx^2 + %dx + %d", a, b, c, wynik, delta);


    }



}
