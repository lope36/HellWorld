package com.week4;

import java.util.Scanner;

public class choinka
{
    public static void main(String[] args)
    {
        Scanner o = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki: ");
        int height = o.nextInt();
        int width = 2*(height + 1) - 1;
        for (int i = 1; i <= height; i++)
        {
            for (int j = 0; j < height - i; j++) System.out.print(" ");
            for (int j = 0; j < (i * 2) - 1; j++) System.out.print("*");
            System.out.println(" ");
        }
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)

                System.out.print("*");

            System.out.println();

        }
        }


    }
