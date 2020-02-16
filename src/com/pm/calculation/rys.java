package com.pm.calculation;

import java.util.Scanner;

public class rys
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int a = scanner.nextInt();

        while (a>0){
            a--;
            System.out.println("bomba wybucjnie za: " + a);
        }

    }

}
