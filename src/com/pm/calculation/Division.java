package com.pm.calculation;

import java.util.Locale;
import java.util.Scanner;

public class Division
{
    private static Object String;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Podaj pierwszą liczbe: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbe: ");
        double b = scanner.nextDouble();

        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a+b);

        

    }



}

