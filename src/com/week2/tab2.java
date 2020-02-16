package com.week2;

import java.util.Arrays;
import java.util.Scanner;

public class tab2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wielkość tablicy: ");
        int n = scanner.nextInt();
        int [] numbers = new int[n];
        int i = 0;
        while (i<n)
        {
            System.out.print("Podaj liczbe: ");
            numbers[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
