package com.pm.calculation;

import java.util.Scanner;

public class kuna
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int a = scanner.nextInt();
        int n=0;

        while (a>0)
        {
            n = n + a;
            a--;
            System.out.println(n);
        }


    }

}
