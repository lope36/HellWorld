package com.pm.calculation;

import java.util.Scanner;

public class Multiply
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("name: ");
        int index = name.lastIndexOf( 'a');
        int lenght = name.length();

        switch (lenght - index)
        {
            case 1 :
                System.out.println("baba");
                break;
            case 0:
                System.out.println("chłop");
                break;

        }
    }

}
