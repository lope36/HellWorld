package com.week2;

import java.util.Scanner;

public class tab4
{
    public static void main(String[] args)
    {
        int [][] a = new int[5][5];

        for (int i = 0; i < a[2].length; i++) {
            a[i][i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                System.out.print(a[i][i1] + " ");
            }
            System.out.println();
        }

    }
}
