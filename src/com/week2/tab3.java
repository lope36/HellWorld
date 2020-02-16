package com.week2;

import java.util.Scanner;

public class tab3
{
    public static void main(String[] args)
    {
       // Scanner scanner = new Scanner(System.in);
      //  int a = scanner.nextInt();
        int [] numbers = {1, 3, 5, 10};
        System.out.println(numbers [0]);
        System.out.println(numbers [1]);
        System.out.println(numbers [2]);
        System.out.println(numbers [3]);
        for (int i = 0; i< numbers.length; i++ )
        {
            System.out.println(numbers [i]);
        }
//indeks parzysty
        for (int i = 0; i< numbers.length; i+=2 )
        {
            System.out.println(numbers [i]);
        }
//parzyste liczby
        for (int i = 0; i< numbers.length; i++ )
        {
            if (numbers [i] % 2 ==0) {
                System.out.println(numbers[i]);
            }
        }
        //odwrotna kolejnosc
        for (int i = numbers.length -1; i>=0; i-- )
        {
            System.out.println(numbers [i]);
        }

    }
}
