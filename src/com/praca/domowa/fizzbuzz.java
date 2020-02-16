package com.praca.domowa;

import java.util.Scanner;

public class fizzbuzz
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("FizzBuzz, podaj liczbe: ");
        int a = scanner.nextInt();
        if (a%15==0)
        {
            System.out.println("FizzBuzz!!!");
        }
        else if (a%5==0)
        {
            System.out.println("Buzz!");
        }
        else if (a%3==0)
        {
            System.out.println("Fizz!");
        }
    }
}
