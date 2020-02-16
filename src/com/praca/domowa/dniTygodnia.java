package com.praca.domowa;

import java.util.Scanner;

public class dniTygodnia
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita: ");
        int a = scanner.nextInt();
        if (a==1){System.out.println("Twoj dzien tyg to poniedziałek)");}
        else if (a==2){System.out.println("Twoj dzien tyg to wtorek");}
        else if (a==3){System.out.println("Twoj dzien tyg to sroda");}
        else if (a==4){System.out.println("Twoj dzien tyg to czwartek");}
        else if (a==5){System.out.println("Twoj dzien tyg to piątek");}
        else if (a==6){System.out.println("Twoj dzien tyg to sobota");}
        else if (a==7){System.out.println("Twoj dzien tyg to niedziela");}
        else if (a<1){System.out.println("invalid number");}
        else if (a>7){System.out.println("invalid number");}

    }
}
