package com.week4;

public class recursive
{
    public static void main(String[] args) {

        int n = 16;
        int r = silnia(n);
        System.out.println(n + "! = " + r);
    }
    public static int silnia (int n) {
        if (n==0) return 1;
        return n * silnia(n-1);
    }
}
