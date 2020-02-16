package com.week4;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static final int size = 10;

    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

    int tab[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            tab[i] = rand.nextInt(100);
        }
        prtinyTab(tab);
        prtinyReverse(tab);
        prtinyNieparz(tab);
        prtinyMod3(tab);
        System.out.println("suma = " + prtinySuma(tab));
        System.out.println("suma 5 cyfr = " + prtinySum5(tab, 5));
        int r = prtinySumback(tab, 5, 500);
        System.out.println("suma 5 cyfr od konca =  " + r);
        int il= numbers(tab, 1000);

//        System.out.println("podaj dzielnik: ");
//        int divider = scan.nextInt();
        int t[] = find2Min(tab);
        System.out.println("2 min el: (" + tab[t[0]] + ", " + tab[t[1]] + ") ");




    }

    public static void prtinyTab(int[] tab)
    {
        int i;
        for (i=0; i < tab.length - 1; i++)
        {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[i - 1]);
    }

    public static void prtinyReverse(int[] tab)
    {
        for (int i = tab.length - 1; i>=0; i--)
        {
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
    }
    public static void prtinyNieparz (int[] tab)
    {
        for (int i = 1; i< tab.length; i+=2 )
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void prtinyMod3 (int [] tab)
    {
        for (int i = 0; i < tab.length ; i++)
        {
        if (tab[i] % 3 ==0)
        {
            System.out.print(tab [i] + " ");
        }
        }
        System.out.println();
    }

    public static int prtinySuma (int[] tab)
    {
        int result = 0;
        for (int i = 0; i < tab.length ; i++) {
            result += tab[i];
        }
        return result;
    }
    public static int prtinySum5 (int[] tab, int n)
{
    int result = 0;
    for (int i = 0; i < n ; i++) {
        result += tab[i];
    }
    return result;
}
    public static int prtinySumback (int[] tab, int n, int m) {
        int result = 0;
        for (int i = tab.length - 1; i > tab.length - 1 - n; i--) {
            if (tab[i] > m) result += tab[i];

        }
        return result;
    }
    public static int numbers (int[] tab, int n)
    {int num = 0;
    int result = 0;
        for (int i = 0; i < tab.length ; i++) {
            result += tab[i];
            num++;
            if (result >=n) break;
        }

    return num;

    }

    public static int [] find2Min (int [] tab) {
        int p1, p2, temp;
        p1 = 0;
        p2 = 1;
        if (tab[p1]>tab[p2]) {
            p1 = 1;
            p2 = 0;
        }
        int i = 2;
        while (i< tab.length) {
            if (tab [i] < tab[p2]) {
                p2=i;
                if (tab[p1]>tab[p2]) {
                    temp = p1;
                    p1 = p2;
                    p2 = temp;
                }
            }
            i++;
        }
        int[] t = new int [2];
        t[0] = p1;
        t[1] = p2;
        return t;
    }

}
