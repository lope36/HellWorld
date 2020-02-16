package com.week2;

import java.util.Scanner;

public class tablica1
{
    public static void main(String[] args)
    {
        String [] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++)
        {
            names[i] = scanner.nextLine();
            System.out.print("Podaj imie użytkownika: ");
        }
        for (int i =0; i<names.length; i++)
        {
            System.out.println("uzytkownicy to: " + names[i]);
        }

    }
}
