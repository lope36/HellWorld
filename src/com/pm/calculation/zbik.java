package com.pm.calculation;

import java.util.Random;
import java.util.Scanner;

public class zbik
{
    public static void main(String[] args)
    {
        int num = new Random().nextInt();
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zgadnij liczbę: ");
        int a = scanner.nextInt();

        while (num!=a) {
            if (num > a) {
                System.out.println("too low");
            } else if (num < a) {
                System.out.println("too high");
            }
        }




    }
}
