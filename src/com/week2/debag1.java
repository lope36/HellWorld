package com.week2;

import java.util.Random;

public class debag1
{
    public static void main(String[] args) {
        int [] numbers = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            numbers [i] = new Random().nextInt(11);
        }
        int sum=0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
