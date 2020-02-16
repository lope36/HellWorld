package com.week4;

import java.util.Random;

import static com.week4.Main.prtinyMod3;
import static com.week4.Main.prtinyTab;
public class sort
{
    public static final int size = 100000; //rozmiar tablicy
    public static void main(String[] args)
    {

        Random rand = new Random();
        int tab[] = new int[size];

        for (int i = 0; i < size; i++)
        {
            tab[i] = rand.nextInt(); //zakres liczb
        }
        //prtinyTab(tab);
      // long t1 =  System.currentTimeMillis();
       // BubbleSort(tab);
       // long t2 =  System.currentTimeMillis();
       // prtinyTab(tab);
       // System.out.println("Czas sortowania:" + (t2 - t1) + " ms");

        long t1 =  System.currentTimeMillis();
        SelectionSort(tab);
        long t2 =  System.currentTimeMillis();
        prtinyTab(tab);
        System.out.println("Czas sortowania:" + (t2 - t1) + " ms");

    }
//    public static void BubbleSort(int[] tab)
//    {
//        int temp;
//        for (int i = 0; i < tab.length-1 ; i++) {
//            for (int j = 0; j < tab.length-1 ; j++) {
//                if (tab[j] > tab[j+1]) {
//                    temp=tab[j];
//                    tab[j] = tab[j+1];
//                    tab[j+1] = temp;
//                }
//            }
//
//        }
//    }
    public static void SelectionSort(int[] tab)
    {
        int pmin, temp;
        for (int i = 0; i < tab.length-1 ; i++)
        {
            pmin = i;
            for (int j = i+1; j < tab.length ; j++)
            {
                if (tab[j] < tab[pmin]) pmin = j;
            }
            temp = tab[pmin];
            tab[pmin] = tab[i];
            tab[i] = temp;
        }
    }

}
