package com.week2;

public class Calculator
{
    int sum=0;
   public int add (int... nums)
   {
       for (int num : nums) {
               sum = sum + num;
       }
       return sum;
           
   }

   public double add (double a, double b)
   {
       return a + b;
   }
    
    
}
