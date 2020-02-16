package com.praca.domowa;

import java.util.Scanner;

public class minmax
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        do {
            System.out.print("Podaj liczbę. 0 kończy działanie programu: ");
            a = scanner.nextInt();
            if ( a < min && a != 0) min = a;
            if ( a > max && a != 0) max = a;
        }
        while (a !=0 );


        System.out.println("Maksymalna liczba podana to: " + max );
        System.out.println("Minimalna liczba podana to: " + min );
    }
}
