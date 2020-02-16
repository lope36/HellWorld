package com.praca.domowa;

public class circle
{
    private double r;

    public circle(double r) {
        this.r = r;
    }

    public double calcArea() {
        return (this.r * this.r * Math.PI); // Pi r kwadrat :)
    }

    public double calcPerimeter() {
        return 2 * this.r * Math.PI; // 2 Pi r
    }

}

