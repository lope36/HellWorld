package com.praca.domowa;

import java.util.Scanner;

public class grosze
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe groszy: ");
        int a = scanner.nextInt();
        int b = a/50;
        int reszta = a-(b*50);
        int c = reszta/20;
        int reszta2 = reszta-(c*20);
        int d = reszta2/10;
        int reszta3 = reszta2-(d*10);
        int e = reszta3/5;
        int reszta4 = reszta3 - (e*5);
        int f = reszta4/2;
        int reszta5 = reszta4 - (f*2);
        int g = reszta5/1;

        System.out.println("liczba użytych monet 50gr: " + b);
        System.out.println("liczba użytych monet 20gr: " + c );
        System.out.println("liczba użytych monet 10gr: " + d );
        System.out.println("liczba użytych monet 5gr: " + e );
        System.out.println("liczba użytych monet 2gr: " + f );
        System.out.println("liczba użytych monet 1gr: " + g );
    }
}


