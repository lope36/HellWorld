package com.pm.calculation;

import java.util.Scanner;

public class wilk
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = scanner.nextInt();
        System.out.print("Podaj potęgę m: ");
        int m = scanner.nextInt();
        int power = 1;
        for (int i = 0;  i< m; i++)
        {
            power = power * n;
        }
System.out.println(power);
    }
}
