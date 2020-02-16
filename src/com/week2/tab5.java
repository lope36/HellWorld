package com.week2;

public class tab5
{
    public static void main(String[] args)
    {
        int [][] a= new int[2][3];

        for (int i = 0; i < a.length; i++)
        {
            for (int i1 = 0; i1 < a[i].length; i1++)
            {
                a[i][i1] = i * a[i].length + i1;
                System.out.print(a[i][i1] + " ");
            }
            System.out.println();
        }
    }
}
