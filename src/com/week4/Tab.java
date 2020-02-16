package com.week4;

import java.util.Random;
import java.util.Scanner;

public class Tab
{
    public static void main(String[] args) {

        Random rand = new Random();

        int tab[][] = new int[5][6];
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab[0].length ; j++)
            {
                tab[i][j] = 50 + rand.nextInt(50);
            }

        }
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = 0; j < tab[0].length ; j++)
            {
                System.out.print(tab [i][j] + " ");;
            }
            System.out.println();

        }
    }
}
