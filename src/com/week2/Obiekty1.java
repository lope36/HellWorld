package com.week2;

public class Obiekty1
{
    public int add(int a, int b)
    {
        return a +b;
    }

    public static void main(String[] args) {
        Obiekty1 okbiekt = new Obiekty1();
       int sum = okbiekt.add(2,3);
        System.out.println(sum);
    }
}
