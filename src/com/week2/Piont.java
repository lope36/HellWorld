package com.week2;

public class Piont
{
    private int x;
    private int y;

    public void inkrementacjax ()
    {
        x++;
    }
    public void inkrementacjay ()
    {
        y++;
    }
    public void inkrementajx (int z)
    {
        x = x+z;
    }
    public void inkrementajy (int z)
    {
        y= y+z;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void print()
    {
        System.out.printf("x: %d, y: %d ", x,y);
    }

    public Piont(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
